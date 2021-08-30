package dto

import com.fasterxml.jackson.annotation.JsonValue

enum class TicketType(@get:JsonValue val typeName : String) {
    INCIDENT("incident"),
    PROBLEM("problem"),
    QUESTION("question");
}


