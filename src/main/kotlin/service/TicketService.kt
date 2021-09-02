package service

import data.store.TicketDataStore
import dto.TicketDTO
import dto.TicketType
import kotlinx.coroutines.*
import java.lang.Error
import java.util.*

class TicketService(private val ticketDataStore : TicketDataStore) {

    private val saltValueForChunking = 50

    fun searchByAssignee(givenAssigneeId: Int): List<TicketDTO> {
        return ticketDataStore.lookupByAssignee(givenAssigneeId)
    }

    fun getAllAssignedTickets() : List<TicketDTO> {
        return ticketDataStore.findAllAssignedTickets()
    }

    fun getAllTickets() : List<TicketDTO> {
        return ticketDataStore.findAllTickets()
    }

    fun searchTicketByType(ticketType: TicketType): List<TicketDTO> {
        return getAllTickets()
            .filter { it.type != null && it.type == ticketType }
    }

    fun searchTicketByUuid(uuid: UUID) : Any = runBlocking {
       val chunkedList = getAllTickets()
            .chunked(saltValueForChunking)
        val jobs = chunkedList.map { async{it::find{ it._id == uuid }} }


        return@runBlocking jobs.awaitAll().first() ?: Error("no ticket could be found")
    }

    fun searchTicketBySubject(subject: String): Any = runBlocking {
        val chunkedList = getAllTickets()
            .chunked(saltValueForChunking)
        val jobs = chunkedList.map { async{it::find{ it.subject == subject }} }

        return@runBlocking jobs.awaitAll().first() ?: Error("no ticket could be found")
    }


}
