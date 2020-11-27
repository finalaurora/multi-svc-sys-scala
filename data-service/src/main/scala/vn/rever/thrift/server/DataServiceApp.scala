package vn.rever.thrift.server

import java.sql._
import java.util.Properties

import org.slf4j.{Logger, LoggerFactory}
import vn.rever.thrift.leadservice.{Lead, Status}

import scala.collection.LinearSeq

object DataServiceApp extends App {
  val logger: Logger = LoggerFactory.getLogger(DataServiceApp.getClass)
  val DB_NAME = "LEADDB"
  val url = s"jdbc:postgresql://localhost/$DB_NAME"
  val USER_NAME = "postgres"
  val USER_PWD = "511530"

  val COL_ID = "id"
  val COL_FIRST = "first_name"
  val COL_LAST = "last_name"
  val COL_EMAIL = "email"
  val COL_PHONE = "phone"
  val COL_SRC = "source"
  val COL_STATUS = "status"
  val COL_CREATED = "created_date"
  val COL_UPDATED = "updated_date"

  var props: Properties = new Properties()
  props.setProperty("user", USER_NAME)
  props.setProperty("password", USER_PWD)
  props.setProperty("ssl", "false")
  logger.info("Postgres connector")
  try {
//    classOf[org.postgresql.Driver]
    val conn = DriverManager.getConnection(url, props)
    val statement = conn.createStatement()
    val sql =
      s"INSERT INTO lead_tbl ($COL_ID, $COL_FIRST, $COL_LAST, $COL_EMAIL, $COL_PHONE, $COL_SRC, $COL_STATUS, $COL_CREATED, $COL_UPDATED) " +
        "VALUES (1, 'Jack', 'Shaw', 'jshaw@techno.vr', '123-1234-123', 'google.com', 'LOOKING_FOR_RENTAL', '2020-11-27 04:05:06', '2020-11-27 04:05:06')"
    statement.executeUpdate(sql)
    val stm = conn.createStatement()
    val rs: ResultSet = stm.executeQuery("SELECT * FROM lead_tbl")
    val leads = LinearSeq[Lead]()
    val lead = new Lead()
    while (rs.next()) {
      lead.setId(rs.getLong(s"$COL_ID"))
      lead.setFirstName(rs.getString(s"$COL_FIRST"))
      lead.setLastName(rs.getString(s"$COL_LAST"))
      lead.setEmail(rs.getString(s"$COL_EMAIL"))
      lead.setPhoneNumber(rs.getString(s"$COL_PHONE"))
      lead.setSource(rs.getString(s"$COL_SRC"))
      lead.setUserStatus(Status.valueOf(rs.getString(s"$COL_STATUS")))
      lead.setCreatedDate(
        rs.getTimestamp(s"$COL_CREATED").toInstant.getEpochSecond
      )
      lead.setUpdatedDate(
        rs.getTimestamp(s"$COL_UPDATED").toInstant.getEpochSecond
      )
      leads :+ lead
      logger.info("Lead info, {}", lead)
    }
  } catch {
    case e: SQLException =>
      logger.error("SQL Exception, Exception:", e)
  }
  val server: ThriftServer = new ThriftServer
  server.doWork()
}
