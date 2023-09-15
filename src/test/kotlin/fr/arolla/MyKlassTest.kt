package fr.arolla

import org.junit.jupiter.api.Test

import org.assertj.core.api.Assertions.assertThat
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`


class MyKlassTest {

    @Test
    internal fun test() {
        val sut = MyKlass()
        val result = sut.isOne()
        assertThat(result).isEqualTo(1)
    }

    @Test
    internal fun `test with mock`(){
        val sut = mock<MyKlass>()
        `when` (sut.isOne()) .thenReturn(8)
        val result = sut.isOne()
        assertThat(result).isEqualTo(8)
    }
}