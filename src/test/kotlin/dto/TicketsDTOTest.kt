package dto.test.data.dto

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import dto.TicketDTO

import dto.test.data.allTickets
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.*
import kotlin.test.assertEquals

@TestInstance(Lifecycle.PER_CLASS)
class TicketsDTOTest {

    private val objectMapper = jacksonObjectMapper()
        .registerModule(JavaTimeModule())
    private val tickets : List<TicketDTO>

    init {
        val ticketJson : String = allTickets
        tickets = objectMapper.readValue(ticketJson)
    }

    @Test
    fun `should be able to load all tickets`(){

        assertEquals(200,tickets.size)
    }

}