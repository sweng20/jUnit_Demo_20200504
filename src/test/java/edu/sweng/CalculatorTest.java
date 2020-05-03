package edu.sweng;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }


    @Test
    void add() {
        // given - calculator initialized by setUp()

        // when - the feature under test is executed
        double result = calculator.add(2.5, 3.0);

        // then verify expected result
        assertEquals(5.5, result);
    }

    @Test
    void sub() {
        // given - calculator initialized by setUp()

        //when
        double result = calculator.sub(3.0, 1.5);

        //then
        assertEquals(1.5, result);
    }
}