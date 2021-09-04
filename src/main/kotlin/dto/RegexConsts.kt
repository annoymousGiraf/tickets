package app.dto

import dto.TicketType

const val uuidRegex = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-5][0-9a-f]{3}-[089ab][0-9a-f]{3}-[0-9a-f]{12}$"
const val stringRegex = "^.+"
const val intRegex = "\\d+"
const val dateFormat = "^[1-9][0-9]+-[0-9]+-[0-9]+[A-Z][0-9]+:[0-9]+:[0-9]+[0-9]+-[0-9]+:[0-9]+"
const val booleanRegex = "true|false"
val ticketTypeRegex = TicketType.values().joinToString( "|").toLowerCase()