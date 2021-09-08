package dto.test.data.service

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import data.factory.DataStoreFactory
import data.factory.DataStoreFactory.DataEntity.*
import data.store.DataStore
import data.store.TicketDataStore
import dto.TicketDTO
import dto.TicketType.*
import dto.test.data.allTickets
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import service.TicketService
import java.time.ZonedDateTime
import java.util.*
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TicketServiceTest {
    val jsonTicketDataStore : DataStore
    val ticketsFromJson : List<TicketDTO> =  jacksonObjectMapper()
        .registerModule(JavaTimeModule())
        .readValue(allTickets)

    init {
        val urlToJson = {}.javaClass.classLoader.getResource("tickets.json").toURI()
        jsonTicketDataStore = DataStoreFactory.createDataStore(urlToJson, TICKETS) as DataStore
    }

    @Test
    fun `should be able to get all tickets`() {
        //Given
        val ticketService : TicketService = TicketService(jsonTicketDataStore as TicketDataStore)
        //When
        val tickets = ticketService.getAllTickets()
        //Then
        assertIterableEquals(ticketsFromJson,tickets)
    }

    @Test
    fun `search ticket by assignee should return all his tickets`() {
        //Given
        val givenAssigneeId : Int  = 24
        val ticketService : TicketService = TicketService(jsonTicketDataStore as TicketDataStore)
        val expectedTickets = ticketsFromJson.filter { it.assignee_id == givenAssigneeId }
        //When
        val tickets : List<TicketDTO> = ticketService.searchByAssignee(givenAssigneeId)

        //Then
        assertIterableEquals(expectedTickets,tickets)
    }

    @Test
    fun `user should be able to view all assigned tickets`() {
        //Given
        val ticketService : TicketService = TicketService(jsonTicketDataStore as TicketDataStore)
        val givenAssignedTickets : List<TicketDTO> =  ticketsFromJson

        //When
        val tickets : List<TicketDTO> = ticketService.getAllAssignedTickets()
        //Then
        assertIterableEquals(getOnlyAssignedTickets(givenAssignedTickets),tickets)
    }

    @Test
    fun `user should be able to search by UUID`() {
        //Given
        val ticketUUID = UUID.fromString("436bf9b0-1147-4c0a-8439-6f79833bff5b")
        val ticketService : TicketService = TicketService(jsonTicketDataStore as TicketDataStore)
        val expectedTicketDTO = ticketsFromJson.find { it._id == ticketUUID }
        //When
        val ticket = ticketService.searchTicketByUuid(ticketUUID)
        //Then
        assertEquals(expectedTicketDTO,ticket)
    }

    @Test
    fun `user should be able to search by type`() {
        //Given
        val ticketType = PROBLEM
        val ticketService : TicketService = TicketService(jsonTicketDataStore as TicketDataStore)
        val expectedTicketDTO = ticketsFromJson.filter { it.type !=  null && it.type == ticketType }

        //When
        val ticket = ticketService.searchTicketByType(ticketType)

        //Then
        assertEquals(expectedTicketDTO,ticket)
    }

    @Test
    fun `user should be able to search by subject`(){
        //Given
        val givenSubject = "A Problem in Heard and McDonald Islands"
        val expectedTicketDTO = ticketsFromJson.find { it.subject == givenSubject }
        val ticketService : TicketService = TicketService(jsonTicketDataStore as TicketDataStore)
        //when
        val ticket = ticketService.searchTicketBySubject(givenSubject)

        //Then
        assertEquals(expectedTicketDTO,ticket)
    }

    @Test
    fun `user should be able to search tickets by date and time`() {

        //Given
        val givenDateTime = ZonedDateTime.parse("2016-02-11T04:46:29-11:00")
        val expectedTicketDTO = ticketsFromJson.filter { it.created_at.isEqual(givenDateTime) }
        val ticketService : TicketService = TicketService(jsonTicketDataStore as TicketDataStore)
        //When
        val tickets = ticketService.searchTicketByTime(givenDateTime)

        //Then
        assertEquals(1, tickets.size)
        assertIterableEquals(expectedTicketDTO,tickets)
    }

    @Test
    fun `user should be able to search tickets by tag`() {
        //Given
        val tag = "wyoming"
        val expectedTicketDTO = ticketsFromJson.filter { it.tags.contains("Wyoming") }
        val ticketService : TicketService = TicketService(jsonTicketDataStore as TicketDataStore)
        //When
        val tickets = ticketService.searchTicketByTag(tag)
        //Then
        assertIterableEquals(expectedTicketDTO,tickets)
    }

    private fun getOnlyAssignedTickets(givenAssignedTickets: List<TicketDTO>) =
        givenAssignedTickets.filter { it.assignee_id != null }
}