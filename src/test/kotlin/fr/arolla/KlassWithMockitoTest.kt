package fr.arolla

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`

class KlassWithMockitoTest {
    
    private val myKlass: MyKlass = mock()
    private val otherKlass = OtherKlass(myKlass)
    
    @Test
    fun `should return value of MyClass as a string`(){
        `when`(myKlass.isOne()).thenReturn(7)
        val result = otherKlass.writeValue()
        assertThat(result).isEqualTo("7")
    }
}