package dto.test.data.extnetion

import app.extnetion.isNullOrEmpty
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ObjectExtentionTest {

    @Test
    fun `object should be able to be validated`(){
        val randomObject : String?  = null
        assertTrue(randomObject.isNullOrEmpty())
    }

}