package pl.zajavka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.zajavka.Calculator;


class CalculatorTest {
Calculator calculator;
    @BeforeEach
    void beforeEach(){
        calculator = new Calculator();
    }

    @Test
    void add() {

        int left = 5;
        int right = 0;
        int expected=5;
        int result = calculator.add(left,right);
        Assertions.assertEquals(expected,result);
    }
}