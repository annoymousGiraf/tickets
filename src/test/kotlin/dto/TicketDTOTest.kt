package dto

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import dto.test.data.ticketWithAssignee
import dto.test.data.ticketWithoutAssignee
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertIterableEquals

import org.junit.jupiter.api.TestInstance.*
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertNull

@TestInstance(Lifecycle.PER_CLASS)
class TicketDTOTest {

    private val objectMapper = jacksonObjectMapper()
        .registerModule(JavaTimeModule())
    private val ticket : TicketDTO

    init {
        val ticketJson : String = ticketWithAssignee
        ticket = objectMapper.readValue(ticketJson)
    }
    
    @Nested
    inner class TicketShouldBeInACorrectFormat {

        @Test
        fun `ticket should have id`() {
            val givenId : UUID = UUID.fromString("436bf9b0-1147-4c0a-8439-6f79833bff5b")

            assertEquals(givenId, ticket._id)
        }

        @Test
        fun `ticket should have created date`() {
            val givenDate = ZonedDateTime
                .parse("2016-04-28T11:19:34-10:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME)
                .withZoneSameInstant(ZoneId.of("UTC"))

            assertEquals(givenDate, ticket.created_at)
        }

        @Test
        fun `ticket should have type`() {
            val givenType = TicketType.INCIDENT

            assertEquals(givenType, ticket.type)
        }


        @Test
        fun `ticket should have subject`() {
            val givenSubject = "A Catastrophe in Korea (North)"

            assertEquals(givenSubject, ticket.subject)
        }

        @Test
        fun `ticket should have assignee id`() {
            val givenAssignedUser = 24

            assertEquals(givenAssignedUser, ticket.assignee_id)
        }

        @Test
        fun `ticket should have tags`() {
            val givenTags = listOf("Ohio",
                "Pennsylvania",
                "American Samoa",
                "Northern Mariana Islands")

            assertIterableEquals(givenTags, ticket.tags)
        }

    }

    @Test
    fun `ticket should be deserialized without assignee`(){
        //Given
        val ticketJson : String = ticketWithoutAssignee
        //When
        val ticket : TicketDTO = objectMapper.readValue(ticketJson)
        //then
        assertNull(ticket.assignee_id)
    }


}