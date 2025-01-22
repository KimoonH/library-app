package com.group.libraryapp.dto.fruit.response;

import java.time.LocalDate;

public class FruitListResponse {
    private final String name;
    private final long price;
    private final LocalDate warehousingDate;

    public FruitListResponse(String name, long price, LocalDate warehousingDate) {
        this.name = name;
        this.price = price;
        this.warehousingDate = warehousingDate;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public LocalDate getWarehousingDate() {
        return warehousingDate;
    }
}
