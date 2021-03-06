package data.store

import dto.TicketDTO

interface TicketDataStore : DataStore {
    fun lookupByAssignee(id : Int) : List<TicketDTO>
    fun findAllAssignedTickets(): List<TicketDTO>
    fun findAllTickets(): List<TicketDTO>
    fun findAllTicketWithTag(tag : String) : List<TicketDTO>
}
