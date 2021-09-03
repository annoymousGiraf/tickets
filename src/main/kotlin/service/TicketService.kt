package service

import data.store.TicketDataStore
import dto.TicketDTO
import dto.TicketType
import kotlinx.coroutines.*
import java.time.ZonedDateTime
import java.util.*

class TicketService(private val ticketDataStore : TicketDataStore) {

    private val saltValueForChunking = 50

    fun searchByAssignee(givenAssigneeId: Int): List<TicketDTO> =
         ticketDataStore.lookupByAssignee(givenAssigneeId)

    fun getAllAssignedTickets() : List<TicketDTO> {
        return ticketDataStore.findAllAssignedTickets()
    }

    fun getAllTickets() : List<TicketDTO> {
        return ticketDataStore.findAllTickets()
    }

    fun searchTicketByType(ticketType: TicketType): List<TicketDTO> = getAllTickets()
            .filter { it.type != null && it.type == ticketType }



    fun searchTicketByUuid(uuid: UUID) : TicketDTO? = runBlocking {
       val chunkedList = getAllTickets()
            .chunked(saltValueForChunking)
        val jobs = chunkedList.map { async{it::find{ it._id == uuid }} }


        return@runBlocking jobs.awaitAll().first()
    }


    fun searchTicketBySubject(subject: String): TicketDTO? = runBlocking {
        val chunkedList = getAllTickets()
            .chunked(saltValueForChunking)
        val jobs = chunkedList.map { async{it::find{ it.subject == subject }} }

        return@runBlocking jobs.awaitAll().first()
    }

    fun searchTicketByTime(time: ZonedDateTime): List<TicketDTO> = getAllTickets()
        .filter { it.created_at.isEqual(time) }



    fun searchTicketByTag(tag: String): List<TicketDTO> {
       return ticketDataStore.findAllTicketWithTag(tag)
    }


}
