package data.store


import dto.TicketDTO

class JsonTicketDataStore(private val jsonDataStore: List<TicketDTO>) : TicketDataStore {

    override fun lookupByAssignee(id: Int): List<TicketDTO> {
        return jsonDataStore.filter { it.assignee_id == id }
    }

}