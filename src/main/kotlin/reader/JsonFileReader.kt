package reader

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import dto.TicketDTO
import dto.UserDTO
import mu.KotlinLogging
import java.net.URI
import java.nio.file.Files
import java.nio.file.Path

open class JsonFileReader(uri: URI) : FileReader {
    val objectMapper = jacksonObjectMapper()
        .registerModule(JavaTimeModule())
    private val logger = KotlinLogging.logger {}
    val jsonString : String
    init {
        jsonString = readFile(uri)
    }

    override fun readFile(uri: URI): String {
        logger.info { "reading file from $uri" }
        return Files.readString(Path.of(uri))
    }
}

class TicketJsonFileReader(uri: URI) : JsonFileReader(uri) {
    val ticketsDTO : List<TicketDTO> =  objectMapper.readValue(jsonString)
}


class UserJsonFileReader(uri: URI) : JsonFileReader(uri) {
    val usersDTO : List<UserDTO> = objectMapper.readValue(jsonString)
}