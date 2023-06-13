package com.example.demo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    Calculator c = new Calculator();
    @Test
    public void f1Test(){
        int a = 10;
        double expect = 25.4;
        double res = c.f1(a);
        assertEquals(expect, res);
    }
}
