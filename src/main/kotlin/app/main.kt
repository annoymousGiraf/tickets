package app

import java.io.File
import java.net.URI
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size == 2) {
        Application(URI(args[0]), URI(args[1]))
        exitProcess(0)
    } else {
        val tickets = File("tickets.json").toURI()
        val users = File("users.json").toURI()
        Application(tickets, users)
        exitProcess(0)
    }
}

