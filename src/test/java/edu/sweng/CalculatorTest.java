package edu.sweng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        // given - a state of teh feature under test
        Calculator calculator = new Calculator();

        // when - the feature under test is executed
        double result = calculator.add(2.5, 3.0);

        // then verify expected result
        assertEquals(5.5, result);
    }
}