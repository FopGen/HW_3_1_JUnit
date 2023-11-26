package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    public  SumCalculator sumCalculator;

    @BeforeEach
    void init(){
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumForOne() throws Exception {
        int inputValue = 1;
        int resultFromSum = sumCalculator.sum(inputValue);
        Assertions.assertEquals(1, resultFromSum);
    }
    @Test
    void sumForThree() throws Exception {
        int inputValue = 3;
        int resultFromSum = sumCalculator.sum(inputValue);
        Assertions.assertEquals(6, resultFromSum);
    }
    @Test
    void sumForZero() {
         Assertions.assertThrows(IllegalArgumentException.class, () -> SumCalculator.sum(0));
    }
}