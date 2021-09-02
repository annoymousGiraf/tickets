package dto.test.data.search

import data.factory.DataStoreFactory
import data.factory.DataStoreFactory.DataEntity.*

import data.store.TicketDataStore
import data.store.UserDataStore
import dto.TicketType
import dto.TicketType.*
import entity.TicketEntity
import entity.User
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import search.SearchDataStores
import service.TicketService
import service.UserService
import java.util.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SearchDataStoresTest {

    val searchDataStores : SearchDataStores

    init {
        val jsonTicketDataStore = createTicketDataStore()

        val jsonUserDataStore: UserDataStore = createUserDataStore()

        val userService : UserService = UserService(jsonUserDataStore)
        val ticketService : TicketService = TicketService(jsonTicketDataStore)

        searchDataStores = SearchDataStores(userService,ticketService)
    }

    @Test
    fun `user should be able to search user with all tickets`() {
        //Given
        val givenUserId = 24
        val expectedTopics = listOf("A Catastrophe in Korea (North)", "A Catastrophe in Belize",
            "A Nuisance in Macedonia", "A Nuisance in Tajikistan")
        //When
        val user : User = searchDataStores.searchUserById(givenUserId)
        //Then
        assertIterableEquals(expectedTopics, user.ticketTopics)

    }

    @Test
    fun `user should be able to search tickets by assignee id`(){
        //Given
        val givenUserId = 24

        //When
        val tickets : List<TicketEntity> = searchDataStores.searchTicketByAssigneeId(givenUserId)
        //Then
        assertEquals(4,tickets.size)
    }

    @Test
    fun `user should be able to search by type`() {
        //Given
        val givenType = TASK

        //When
        val tickets = searchDataStores.searchTicketByType(givenType)
        //Then
        assertEquals(58,tickets.size)
    }

    @Test
    fun `user should be able to search Ticket by UUID`(){
        //Given
        val ticketUUID = UUID.fromString("436bf9b0-1147-4c0a-8439-6f79833bff5b")

        //When
        val ticket = searchDataStores.searchTicketByUUID(ticketUUID)
        //Then
        assertEquals("A Catastrophe in Korea (North)" , ticket.ticketDTO.subject)
    }

    private fun createUserDataStore(): UserDataStore {
        val usersUrlToJson = {}.javaClass.classLoader
            .getResource("users.json")
        return DataStoreFactory
            .createDataStore(usersUrlToJson, USERS) as UserDataStore
    }

    private fun createTicketDataStore(): TicketDataStore {
        val ticketUrlToJson = {}.javaClass.classLoader
            .getResource("tickets.json")
        return DataStoreFactory
            .createDataStore(ticketUrlToJson, TICKETS) as TicketDataStore
    }

}