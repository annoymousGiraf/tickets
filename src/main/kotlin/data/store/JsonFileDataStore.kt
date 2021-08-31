package data.store

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import dto.TicketDTO
import java.net.URL

class JsonFileDataStore(url : URL) : TicketDataStore {

    private val tickets : List<TicketDTO>

    init {
        val objectMapper = jacksonObjectMapper()
            .registerModule(JavaTimeModule())
        tickets = objectMapper.readValue(url)
    }

    override fun lookupByAssignee(id: Int): List<TicketDTO> {
        return tickets.filter { it.assignee_id == id }
    }

}