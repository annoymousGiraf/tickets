package dto.test.data.service

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import data.factory.DataStoreFactory
import data.factory.DataStoreFactory.*
import data.factory.DataStoreFactory.DataEntity.*
import data.store.DataStore
import data.store.TicketDataStore
import dto.TicketDTO
import dto.test.data.allTickets
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import service.TicketService
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TicketServiceTest {
    val jsonTicketDataStore : DataStore

    init {
        val urlToJson = {}.javaClass.classLoader.getResource("tickets.json")
        jsonTicketDataStore = DataStoreFactory.createDataStore(urlToJson, TICKETS) as DataStore
    }
    @Test
    fun `should be able to get all tickets`() {
        //Given
        val ticketService : TicketService = TicketService(jsonTicketDataStore as TicketDataStore)
        //When
        val tickets = ticketService.getAllTickets()
        //Then
        assertEquals(200,tickets.size)
    }

    @Test
    fun `search ticket by assignee should return all his tickets`() {
        //Given
        val givenAssigneeId : Int  = 24
        val ticketService : TicketService = TicketService(jsonTicketDataStore as TicketDataStore)
        //When
        val tickets : List<TicketDTO> = ticketService.searchByAssignee(givenAssigneeId)

        //Then
        assertEquals(4,tickets.size)
    }

    @Test
    fun `user should be able to view all assigned tickets`() {
        //Given
        val ticketService : TicketService = TicketService(jsonTicketDataStore as TicketDataStore)
        val givenAssignedTickets : List<TicketDTO> =  jacksonObjectMapper()
            .registerModule(JavaTimeModule())
            .readValue(allTickets)

        //When
        val tickets : List<TicketDTO> = ticketService.getAllAssignedTickets()
        //Then
        assertIterableEquals(getOnlyAssignedTickets(givenAssignedTickets),tickets)
    }

    private fun getOnlyAssignedTickets(givenAssignedTickets: List<TicketDTO>) =
        givenAssignedTickets.filter { it.assignee_id != null }
}