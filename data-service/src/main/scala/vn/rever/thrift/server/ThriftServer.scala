package vn.rever.thrift.server

import java.util.concurrent.{
  ArrayBlockingQueue,
  ExecutorService,
  ThreadPoolExecutor,
  TimeUnit
}

import org.apache.thrift.protocol.TBinaryProtocol
import org.apache.thrift.server.{THsHaServer, TServer}
import org.apache.thrift.server.THsHaServer.Args
import org.apache.thrift.transport.{
  TFramedTransport,
  TNonblockingServerSocket,
  TNonblockingServerTransport
}
import org.slf4j.{Logger, LoggerFactory}
import vn.rever.thrift.leadservice.LeadService
import vn.rever.thrift.leadservice.LeadService.{Iface, Processor}

class ThriftServer {
  val logger: Logger = LoggerFactory.getLogger(this.getClass)
  var processor: LeadService.Processor[LeadService.Iface] = null
  var handler: Iface = null

  def doWork(): Unit = {
    handler = new LeadServiceHandler
    processor = new Processor(handler)
    val runner: Runnable = new Runnable {
      override def run(): Unit = {
        doStartServer(processor)
      }
    }
    var thriftThread: Thread = new Thread(runner)
    thriftThread.start()
    logger.debug("Thrift service starting ...")
  }

  private def doStartServer(procesor: LeadService.Processor[Iface]): Unit = {
    try {
      val serverTransport: TNonblockingServerTransport =
        new TNonblockingServerSocket(8088)
      val executor: ExecutorService = new ThreadPoolExecutor(
        2,
        10,
        120,
        TimeUnit.SECONDS,
        new ArrayBlockingQueue(10)
      )
      val args: Args = new Args(serverTransport)
        .maxWorkerThreads(10)
        .protocolFactory(new TBinaryProtocol.Factory())
        .inputTransportFactory(new TFramedTransport.Factory)
        .outputTransportFactory(new TFramedTransport.Factory)
        .executorService(executor)
      val server: TServer = new THsHaServer(args)
      logger.debug("Server listening at port 8088 ... ")
      server.serve()
      logger.debug("Server started")
    } catch {
      case e: Exception => println(e.getMessage)
    }
  }
}
