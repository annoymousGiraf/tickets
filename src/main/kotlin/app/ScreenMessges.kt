package app

import dto.ticketDataTypes
import dto.userDataTypes

val promptScreen = """
        Welcome to Ticket And Users Search Engine
        Type `quit` to exit at any time, select one of the options bellow
        
                    * press 1 to search
                    * press 2 to lookup fields
                    * type `quit` to exit
    """.trimIndent()


val termsForSearch = """
        Options for User
        ----------------
${userDataTypes.keys.joinToString("\n")}
        -------------------
        Options for Tickets
        -------------------
${ticketDataTypes.keys.joinToString("\n")}
        """.trimIndent()