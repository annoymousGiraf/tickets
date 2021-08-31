package data.store

import dto.TicketDTO

interface TicketDataStore {
    fun lookupByAssignee(id : Int) : List<TicketDTO>
}
