package dto

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import dto.test.data.ticketWithAssignee

import org.junit.jupiter.api.Test
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import kotlin.test.assertEquals

class TicketDTOTest {

    private val objectMapper = jacksonObjectMapper()
        .registerModule(JavaTimeModule())


    @Test
    fun `Should parse ticket structure`() {
        //Given
        val ticketJson : String = ticketWithAssignee
        val givenDate = ZonedDateTime.parse("2016-04-28T11:19:34-10:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME).withZoneSameInstant(
            ZoneId.of("UTC"))

        //When

        val ticket : TicketDTO = objectMapper.readValue(ticketJson)

        //Then
        assertEquals(24, ticket.assignee_id)
        assertEquals(TicketType.INCIDENT, ticket.type)
        assertEquals(givenDate, ticket.created_at)
    }


}