package app.extnetion

fun Any.isNullOrEmpty() : Boolean {
    if (this is Collection<*> || this is Map<*, *>) {
       return this.isNullOrEmpty()
    }
    return this == null
}