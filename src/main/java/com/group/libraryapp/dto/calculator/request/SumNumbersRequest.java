package com.group.libraryapp.dto.calculator.request;

import java.util.List;

public class SumNumbersRequest {

    private List<Integer> numbers;

    public SumNumbersRequest() {
    }

    public SumNumbersRequest(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
