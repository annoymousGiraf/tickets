package app



fun main(args : Array<String>)  {
    val tickets = {}.javaClass.classLoader.getResource("tickets.json")
    val users = {}.javaClass.classLoader.getResource("users.json")
    Application(tickets,users)
}