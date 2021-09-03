package app

import app.extnetion.isNullOrEmpty
import data.factory.DataStoreFactory
import data.factory.DataStoreFactory.DataEntity.*
import data.store.TicketDataStore
import data.store.UserDataStore
import dto.ticketDataTypes
import dto.userDataTypes
import search.SearchDataStores
import service.TicketService
import service.UserService
import java.lang.Error
import java.net.URL
import java.time.ZonedDateTime
import kotlin.reflect.KFunction
import kotlin.system.exitProcess

class Application( tickets : URL,  user : URL) {


    private val searchDataStore : SearchDataStores
    private val ticketSearchCommand : Map<String, KFunction<*>>


    private val promptScreen = """
        Welcome to Ticket And Users Search Engine
        Type `quit` to exit at any time, select one of the options bellow
        
                    * press 1 to search
                    * press 2 to lookup fields
                    * type `quit` to exit
    """.trimIndent()

    init {
        val ticketsDataStore = DataStoreFactory.createDataStore(tickets,TICKETS)
        val userDataStore = DataStoreFactory.createDataStore(user, USERS)

        if (ticketsDataStore is Error || userDataStore is Error) {
            println("Could not support data stores")
            exitProcess(1)
        }

        searchDataStore = SearchDataStores(UserService(userDataStore as UserDataStore),
            TicketService(ticketsDataStore as TicketDataStore))



       ticketSearchCommand = mapOf(
           "_id" to searchDataStore::searchTicketByUUID,
           "created_at" to searchDataStore::searchUsersByCreatedDate,
           "type" to searchDataStore::searchTicketByType,
           "subject" to searchDataStore::searchTicketBySubject,
           "assignee_id" to searchDataStore::searchTicketByAssigneeId,
           "tags" to searchDataStore::searchTicketByTag

       )
        runApp()
    }

    private fun runApp() {
        println(promptScreen)
        var option = readLine()
        while (option != "quit") {
            when(option) {
                "1" -> runSearch()
                "2" -> showOptions()
                else -> println("invalid Option choose 1 or 2, or type quit to exit")
            }
            option = readLine()
        }

    }

    private fun runSearch() {
        println("Would like to search Ticket press 1 if you would like to search Users type 2 to go back type `back`")
        when (val option = readLine()) {
            "1" -> searchTickets()
            "2" -> searchUsers()
            "back" -> println(promptScreen).also {  return }
            else -> {
                println("you typed $option, which is invalid")
                runSearch()
            }
        }

    }

    private fun searchTickets() {
        println("Search Tickets")
    }



    private fun searchUsers() {
        val (term, value) = getSearchInput()
        if ((term.isNullOrEmpty() || value.isNullOrEmpty()) ) {
            println("Search input is not valid")
            return
        }

        if (userDataTypes[term] == null) {
            println("the term: $term isnt supported")
            return
        }

        if (!value.matches(userDataTypes[term]!!)) {
            println("$value doesnt not match the type of $term")
            return
        }

        val users = userSearchCommand(term,value)
        println("Searching users for $term with a value of $value")
        if (users == null || users.isNullOrEmpty()){
            println("No results were found")
            return
        }
        println(users)
    }

    private fun isInputValid(term: String?, value: String?) = term.isNullOrEmpty() || value.isNullOrEmpty()

    private fun getSearchInput(): Pair<String?, String?> {
        println("Enter search term")
        val term = readLine()

        println("Enter search value")
        val value = readLine()
        return Pair(term, value)
    }

    private fun showOptions() {

        println("Options for User")
        println("---------------")
        println(userDataTypes.keys.joinToString("\n"))
        println("---------------")
        println("Options for Tickets")
        println("---------------")
        println(ticketDataTypes.keys.joinToString("\n"))

        println("---------------")
        println("press `enter` to go back")
        readLine()
        println(promptScreen)
    }


    private fun userSearchCommand(term : String, value : String) : Any? = when(term) {
        "_id" -> searchDataStore.searchUserById(value.toInt())
        "name" -> searchDataStore.searchUserByName(value)
        "created_at" -> searchDataStore.searchUsersByCreatedDate(ZonedDateTime.parse(value))
        "verified" -> searchDataStore.searchUserByVerification(value.toBoolean())
        else -> {
            println("Search Term doesnt exist")
            null
        }
    }




}

