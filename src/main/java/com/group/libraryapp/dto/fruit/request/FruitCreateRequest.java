package com.group.libraryapp.dto.fruit.request;

import java.time.LocalDate;

public class FruitCreateRequest {

    private String name;
    private long price;
    private LocalDate warehousingDate;

    public FruitCreateRequest(String name, long price, LocalDate warehousingDate) {
        this.name = name;
        this.price = price;
        this.warehousingDate = warehousingDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getWarehousingDate() {
        return warehousingDate;
    }

    public long getPrice() {
        return price;
    }
}
