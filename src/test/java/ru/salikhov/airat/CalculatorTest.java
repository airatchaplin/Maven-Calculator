package ru.salikhov.airat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    final private Calculator calculator = new Calculator();

    @ParameterizedTest
    @MethodSource("ru.salikhov.airat.Providers#testArithmeticOperationSum")
    @DisplayName("Тест метода testArithmeticOperationSum")
    void testArithmeticOperationSum(String expression, double expected){
        assertThat(calculator.getAnswer(calculator.ReversePolishNotation(expression)), is(expected));
    }

    @ParameterizedTest
    @MethodSource("ru.salikhov.airat.Providers#testArithmeticOperationMinus")
    @DisplayName("Тест метода testArithmeticOperationMinus")
    void testArithmeticOperationMinus(String expression, double expected){
        assertThat(calculator.getAnswer(calculator.ReversePolishNotation(expression)), is(expected));
    }

    @ParameterizedTest
    @MethodSource("ru.salikhov.airat.Providers#testArithmeticOperationMultiplications")
    @DisplayName("Тест метода testArithmeticOperationMultiplications")
    void testArithmeticOperationMultiplications(String expression, double expected){
        assertThat(calculator.getAnswer(calculator.ReversePolishNotation(expression)),is(expected));
    }

    @ParameterizedTest
    @MethodSource("ru.salikhov.airat.Providers#testArithmeticOperationDivision")
    @DisplayName("Тест метода testArithmeticOperationDivision")
    void testArithmeticOperationDivision(String expression, double expected){
        assertThat(calculator.getAnswer(calculator.ReversePolishNotation(expression)), is(expected));
    }

    @ParameterizedTest
    @MethodSource("ru.salikhov.airat.Providers#testArithmeticOperationDivisionByZero")
    @DisplayName("Тест метода testArithmeticOperationDivisionByZero")
    void testArithmeticOperationDivisionByZero(String expression){
        Exception exception = assertThrows(ArithmeticException.class,
                () -> calculator.getAnswer(calculator.ReversePolishNotation(expression)));
        assertThat("Ошибка, деление на 0!", is(equalTo(exception.getMessage())));
    }
}
