package com.group.libraryapp.dto.fruit.response;

import java.sql.Date;
import java.time.LocalDateTime;

public class FruitResponse {

    private long id;
    private String name;
    private long price;
    private LocalDateTime warehousingDate;
    private int salesYN;

    public FruitResponse(long id, String name, long price, Date warehousingDate, int salesYN) {
    }

    public FruitResponse(long id, String name, long price, LocalDateTime warehousingDate, int salesYN) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warehousingDate = warehousingDate;
        this.salesYN = salesYN;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public LocalDateTime getWarehousingDate() {
        return warehousingDate;
    }

    public int getSalesYN() {
        return salesYN;
    }
}
