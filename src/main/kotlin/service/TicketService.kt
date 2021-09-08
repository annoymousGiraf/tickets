package service

import data.store.TicketDataStore
import dto.TicketDTO
import dto.TicketType
import kotlinx.coroutines.*
import mu.KotlinLogging
import java.time.ZonedDateTime
import java.util.*

class TicketService(private val ticketDataStore : TicketDataStore) {

    private val saltValueForChunking = 50
    private val logger = KotlinLogging.logger {}

    fun searchByAssignee(assigneeId: Int): List<TicketDTO> =
         ticketDataStore.lookupByAssignee(assigneeId)
             .also { logger.debug { "searching ticket by assignee = $assigneeId" } }

    fun getAllAssignedTickets() : List<TicketDTO> {
        return ticketDataStore.findAllAssignedTickets()
    }

    fun getAllTickets() : List<TicketDTO> {
        logger.info { "getting all the tickets in store " }
        return ticketDataStore.findAllTickets()
    }

    fun searchTicketByType(ticketType: TicketType): List<TicketDTO> = getAllTickets()
            .filter { it.type != null && it.type == ticketType }
            .also { logger.debug { "searching ticket by type = $ticketType" } }



    fun searchTicketByUuid(uuid: UUID) : TicketDTO? = runBlocking {
        logger.info { "chunking Tickets list to optimise search" }
        val chunkedList = getAllTickets()
            .chunked(saltValueForChunking)
        val jobs = chunkedList.map { async{it::find{ it._id == uuid }} }


        return@runBlocking jobs.awaitAll().first()
    }


    fun searchTicketBySubject(subject: String): TicketDTO? = runBlocking {
        logger.info { "chunking Tickets list to optimise search" }
        val chunkedList = getAllTickets()
            .chunked(saltValueForChunking)
        val jobs = chunkedList.map { async{it::find{ it.subject.equals(subject,ignoreCase = true) }} }

        return@runBlocking jobs.awaitAll().first()
    }

    fun searchTicketByTime(time: ZonedDateTime): List<TicketDTO> = getAllTickets()
        .filter { it.created_at.isEqual(time) }
        .also { logger.debug { "searching ticket by time = $time" } }


    fun searchTicketByTag(tag: String): List<TicketDTO> = ticketDataStore
        .findAllTicketWithTag(tag)
        .also { logger.debug { "searching ticket by tag = $tag" } }

}
