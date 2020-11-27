package vn.rever.thrift.server

import java.{lang, util}

import vn.rever.thrift.leadservice.Lead
import vn.rever.thrift.leadservice.LeadService.Iface

class LeadServiceHandler extends Iface {
  override def getAll: util.Map[lang.Long, Lead] = {
    return new util.HashMap[lang.Long, Lead]()
  }

  override def getById(id: Long): Lead = ???

  /**
    * * Add new lead to DB
    * *
    *
    * @param newLead
    */
  override def addNew(newLead: Lead): Unit = ???

  /**
    * * Remove Lead from DB by their id
    * *
    *
    * @param id
    */
  override def removeById(id: Long): Unit = ???

  /**
    * * Update lead using new info
    * *
    *
    * @param lead
    */
  override def updateLead(lead: Lead): Unit = ???
}
