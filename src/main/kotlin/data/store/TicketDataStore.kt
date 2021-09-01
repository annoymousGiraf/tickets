package data.store

import dto.TicketDTO

interface TicketDataStore : DataStore {
    fun lookupByAssignee(id : Int) : List<TicketDTO>
}
