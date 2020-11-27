package vn.rever.thrift.server

import java.sql.{Connection, DriverManager, ResultSet, SQLException}
import java.util
import java.util.Properties

import org.slf4j.{Logger, LoggerFactory}
import vn.rever.thrift.leadservice.LeadService.Iface
import vn.rever.thrift.leadservice.{Lead, Status}
import vn.rever.thrift.server.LeadServiceHandler.logger

class LeadServiceHandler extends Iface {

  val DB_NAME = "LEADDB"
  val TABLE_NAME = "lead_tbl"
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

  val conn: Connection = DriverManager.getConnection(url, props)

  override def getAll: util.Map[Long, Lead] = {
    val stm = conn.createStatement()
    val rs: ResultSet = stm.executeQuery(s"SELECT * FROM $TABLE_NAME")
    val results = new util.HashMap[Long, Lead]()
    val lead = new Lead()

    // Traverse through return data set to add new record to collection
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
      results.put(lead.id, lead)
      logger.info("New lead info obtained, {}", lead)
    }
    stm.close()
    results
  }

  override def getById(id: Long): Lead = {
    var lead = new Lead()
    try {
      val stm = conn.createStatement()
      val rs: ResultSet =
        stm.executeQuery(s"SELECT * FROM $TABLE_NAME WHERE id = $id")

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
        return lead
      }
    } catch {
      case e: SQLException =>
        logger.error("")
        return lead
    }
    lead
  }

  /**
    * * Add new lead to DB
    * *
    *
    * @param newLead new Lead object to add to current DB
    */
  override def addNew(newLead: Lead): Unit = {
    val stm = conn.createStatement()

  }

  /**
    * * Remove Lead from DB by their id
    * *
    *
    * @param id id of Lead record to get
    */
  override def removeById(id: Long): Unit = {}

  /**
    * * Update lead using new info
    * *
    *
    * @param lead lead object to be updated
    */
  override def updateLead(lead: Lead): Unit = {}
}

object LeadServiceHandler {
  val logger: Logger = LoggerFactory.getLogger(this.getClass)
}
