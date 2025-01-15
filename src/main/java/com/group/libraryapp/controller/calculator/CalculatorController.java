package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import com.group.libraryapp.dto.calculator.request.SumNumbersRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class CalculatorController {

    @GetMapping("/add") // GET /add
    public int addTwoNumbers(CalculatorAddRequest request) {
        return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply")
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {

        return request.getNumber1() * request.getNumber2();
    }

    @GetMapping("/api/v1/calc")
    public Map<String, Object> calculateTwoNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        Map<String, Object> result = new HashMap<>();
        result.put("add", num1 + num2);
        result.put("minus", num1 - num2);
        result.put("multiply", num1 * num2);
        return result;
    }

    @GetMapping("/api/v1/day-of-week")
    public Map<String, String> getDayOfWeek(@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {

        DayOfWeek dayOfWeek = date.getDayOfWeek(); // 요일 계산
        Map<String, String> result = new HashMap<>();
        result.put("dayOfWeek", dayOfWeek.toString());

        return result;
    }

    @PostMapping("/api/v1/sum")
    public int sumNumbers(@RequestBody SumNumbersRequest request) {
        List<Integer> numbers = request.getNumbers();
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }

}
