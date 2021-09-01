package service

import data.store.TicketDataStore
import dto.TicketDTO

class TicketService(private val ticketDataStore : TicketDataStore) {

    fun searchByAssignee(givenAssigneeId: Int): List<TicketDTO> {
        return ticketDataStore.lookupByAssignee(givenAssigneeId)
    }

    fun getAllAssignedTickets() : List<TicketDTO> {
        return ticketDataStore.findAllAssignedTickets()
    }

    fun getAllTickets() : List<TicketDTO> {
        return ticketDataStore.findAllTickets()
    }


}
