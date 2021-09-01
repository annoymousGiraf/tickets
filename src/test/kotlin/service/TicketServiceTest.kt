package dto.test.data.service

import data.factory.DataStoreFactory
import data.factory.DataStoreFactory.*
import data.factory.DataStoreFactory.DataEntity.*
import data.store.DataStore
import data.store.TicketDataStore
import dto.TicketDTO
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import service.TicketService
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TicketServiceTest {
    val jsonTicketDataStore : DataStore

    init {
        val urlToJson = {}.javaClass.classLoader.getResource("tickets.json")
        jsonTicketDataStore = DataStoreFactory.createDataStore(urlToJson, TICKETS)
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

}