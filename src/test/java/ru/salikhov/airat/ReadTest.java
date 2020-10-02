package ru.salikhov.airat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ReadTest {

    Read read = new Read();

    @ParameterizedTest
    @MethodSource("ru.salikhov.airat.Providers#testHandleString")
    @DisplayName("Тест метода testHandleString")
    void testHandleString(String expression, String expected){
        assertThat(read.handleString(expression), is(expected));
    }
}
