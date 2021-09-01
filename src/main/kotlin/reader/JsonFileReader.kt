package reader

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import dto.TicketDTO
import dto.UserDTO
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path

open class JsonFileReader(url : URL) : FileReader {
    val objectMapper = jacksonObjectMapper()
        .registerModule(JavaTimeModule())

    val jsonString : String
    init {
        jsonString = readFile(url)
    }

    override fun readFile(url: URL): String {
        return Files.readString(Path.of(url.toURI()))
    }
}

class TicketJsonFileReader(url: URL) : JsonFileReader(url) {

    fun loadTickets() : List<TicketDTO> {
        return objectMapper.readValue(jsonString)
    }
}


class UserJsonFileReader(url: URL) : JsonFileReader(url) {

    fun loadUsers() : List<UserDTO> {
        return objectMapper.readValue(jsonString)
    }
}