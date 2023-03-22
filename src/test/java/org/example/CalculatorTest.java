package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    void calculate() {

        String expression = "10 cm + 20 dm";
        String outputType = "cm";
        assertEquals(210,calculator.calculate(expression,outputType));
    }

}