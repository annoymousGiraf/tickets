package reader

import java.net.URL

interface FileReader {

    fun readFile(url: URL) : String

}