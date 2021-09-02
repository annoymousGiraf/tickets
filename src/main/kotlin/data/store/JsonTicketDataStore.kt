package data.store


import dto.TicketDTO

class JsonTicketDataStore(private val jsonDataStore: List<TicketDTO>) : TicketDataStore {

    private val unassignedTickets : List<TicketDTO> = jsonDataStore.filter { it.assignee_id == null }
    private val assignedTickets : List<TicketDTO> = jsonDataStore - unassignedTickets
    private val indexedTags : Map<String,Set<TicketDTO>> = jsonDataStore
        .asSequence()
        .flatMap { it.tags.distinct() }
        .map { it to jsonDataStore.filter { ticket -> ticket.tags.contains(it) }.toSet() }
        .toMap()

    override fun lookupByAssignee(id: Int): List<TicketDTO> {
        return jsonDataStore.filter { it.assignee_id == id }
    }

    override fun findAllAssignedTickets(): List<TicketDTO> {
        return assignedTickets
    }

    override fun findAllTickets(): List<TicketDTO> {
        return jsonDataStore
    }

    override fun findAllTicketWithTag(tag: String): List<TicketDTO> {
        return indexedTags[tag]?.toList() ?: listOf()
    }


}