package app

import app.extnetion.isNullOrEmpty
import data.factory.DataStoreFactory
import data.factory.DataStoreFactory.DataEntity.*
import data.store.TicketDataStore
import data.store.UserDataStore
import dto.TicketType
import dto.ticketDataTypes
import dto.userDataTypes
import mu.KotlinLogging
import search.SearchDataStores
import service.TicketService
import service.UserService
import java.lang.Error
import java.net.URL
import java.time.ZonedDateTime
import java.util.*
import kotlin.system.exitProcess

class Application( tickets : URL,  user : URL) {

    private val searchDataStore : SearchDataStores
    private val logger = KotlinLogging.logger {}
    init {
        val ticketsDataStore = DataStoreFactory.createDataStore(tickets,TICKETS)
        val userDataStore = DataStoreFactory.createDataStore(user, USERS)

        if (ticketsDataStore is Error || userDataStore is Error) {
            println("Could not support data stores")
            logger.error { "Data Store could not be supported."}
            exitProcess(1)
        }
        logger.info { "data stores connected" }
        searchDataStore = SearchDataStores(UserService(userDataStore as UserDataStore),
            TicketService(ticketsDataStore as TicketDataStore))

        runApp()
    }

    private fun runApp() {
        logger.info { "Starting CLI Search Engine" }
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
        val (term, value) = getSearchInput()

        val pattern = ticketDataTypes[term]

        if (!isValueAndTermSupported(pattern, term, value)) return


        val tickets = ticketSearchCommand(term,value)
        println("Searching tickets for $term with a value of $value")
        if (tickets == null || tickets.isNullOrEmpty()){
            println("No results were found")
            return
        }
        println(tickets)
        waitBeforeGoingBack()
    }

    private fun searchUsers() {
        println("Search Users")
        val (term, value) = getSearchInput()

        val pattern = userDataTypes[term]

        if (!isValueAndTermSupported(pattern, term, value)) return

        val users = userSearchCommand(term,value)
        println("Searching users for $term with a value of $value")
        if (users == null || users.isNullOrEmpty()){
            println("No results were found")
            return
        }
        println(users)
        waitBeforeGoingBack()
    }

    private fun isValueAndTermSupported(
        pattern: Regex?,
        term: String,
        value: String
    ): Boolean {
        if (pattern == null) {
            logger.error { "could not locate the selected term $term" }
            println("the term: $term isnt supported or could not be found")
            return false
        }

        if (!value.matches(pattern)) {
            println("$value doesnt not match the type of $term")
            logger.error { "$value is not a match forr $term"  }
            return false
        }
        return true
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

    private fun ticketSearchCommand (term : String, value : String) : Any? = when(term) {
        "_id" -> searchDataStore.searchTicketByUUID(UUID.fromString(value))
        "created_at" -> searchDataStore.searchUsersByCreatedDate(ZonedDateTime.parse(value))
        "type" -> searchDataStore.searchTicketByType(TicketType.valueOf(value.toUpperCase()))
        "subject" -> searchDataStore.searchTicketBySubject(value)
        "assignee_id" -> searchDataStore.searchTicketByAssigneeId(value.toInt())
        "tags" -> searchDataStore.searchTicketByTag(value)
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

