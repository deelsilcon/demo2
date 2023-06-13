package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    Calculator a = new Calculator();

    @RequestMapping("/f1")
    public double f1(int in) {
        return a.f1(in);
    }
}
