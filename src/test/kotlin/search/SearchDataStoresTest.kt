package dto.test.data.search

import data.factory.DataStoreFactory
import data.factory.DataStoreFactory.DataEntity.*

import data.store.TicketDataStore
import data.store.UserDataStore
import entity.User
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import search.SearchDataStores
import service.TicketService
import service.UserService

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