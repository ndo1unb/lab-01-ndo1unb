package com.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class CalculatorController {
    @GetMapping("/calculator")
    public String text() {
        return "Calculator";
    }
}
