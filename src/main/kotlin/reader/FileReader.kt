package reader

import java.net.URI

interface FileReader {

    fun readFile(uri: URI) : String

}