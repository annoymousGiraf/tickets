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
            println(promptScreen)
            option = readLine()
        }

    }

    private fun runSearch() {
        println("Would like to search Ticket press 1 if you would like to search Users type 2 to go back type `back`")
        when (val option = readLine()) {
            "1" -> searchTickets()
            "2" -> searchUsers()
            "back" -> return
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

        val pattern = userDataTypes[term]

        if (pattern == null) {
            println("the term: $term isnt supported or could not be found")
            return
        }

        if (!value.matches(pattern)) {
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
        waitBeforeGoingBack()
    }

    private fun isInputValid(term: String?, value: String?) = term.isNullOrEmpty() || value.isNullOrEmpty()

    private fun getSearchInput(): Pair<String, String> {
        println("Enter search term")
        val term = readLine()

        println("Enter search value")
        val value = readLine()

        if ((isInputValid(term,value)) ) {
            println("Search input is not valid")
            return Pair("","")
        }

        return Pair(term!!, value!!)
    }

    private fun showOptions() {
        println(termsForSearch)
        waitBeforeGoingBack()
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

    private fun waitBeforeGoingBack() {
        println("press `enter` to go back")
        readLine()
    }



}

