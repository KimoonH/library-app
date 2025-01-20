package com.group.libraryapp.domain.fruit;

public class Fruit {

    private long id;
    private String name;
    private long price;
    private int salesYN;

    public Fruit() {
    }

    public Fruit(long id, String name, long price, int salesYN) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public int getSalesYN() {
        return salesYN;
    }
}
