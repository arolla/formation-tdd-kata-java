package fr.arolla;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

public class MyClassTest {

    @Test
    public void test() {
        final var sut = new MyClass();

        final var result = sut.isOne();

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test_with_mock() {
        final var sut = Mockito.mock(MyClass.class);
        Mockito.when(sut.isOne()).thenReturn(8);

        final var result = sut.isOne();

        assertThat(result).isEqualTo(8);
    }
}
