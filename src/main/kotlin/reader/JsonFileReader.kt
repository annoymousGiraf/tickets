package reader

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import dto.TicketDTO
import dto.UserDTO
import mu.KotlinLogging
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path

open class JsonFileReader(url : URL) : FileReader {
    val objectMapper = jacksonObjectMapper()
        .registerModule(JavaTimeModule())
    private val logger = KotlinLogging.logger {}
    val jsonString : String
    init {
        jsonString = readFile(url)
    }

    override fun readFile(url: URL): String {
        logger.info { "reading file from $url" }
        return Files.readString(Path.of(url.toURI()))
    }
}

class TicketJsonFileReader(url: URL) : JsonFileReader(url) {
    val ticketsDTO : List<TicketDTO> =  objectMapper.readValue(jsonString)
}


class UserJsonFileReader(url: URL) : JsonFileReader(url) {
    val usersDTO : List<UserDTO> = objectMapper.readValue(jsonString)
}