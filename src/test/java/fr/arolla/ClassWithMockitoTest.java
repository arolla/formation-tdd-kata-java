package fr.arolla;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClassWithMockitoTest {

    @Mock
    MyClass myClass;

    @InjectMocks
    OtherClass sut;

    @Test
    void should_return_value_of_MyClass_as_a_string() {
        when(myClass.isOne()).thenReturn(7);

        String result = sut.writeValue();

        assertThat(result).isEqualTo("7");
    }
}
