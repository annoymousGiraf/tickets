package app.extnetion

fun Any.isNullOrEmpty() : Boolean {

    if (this is Collection<*> ) {
       return this.isEmpty()
    }
    if (this is Map<*,*>)
    {
        return this.isEmpty()
    }
    return this == null
}