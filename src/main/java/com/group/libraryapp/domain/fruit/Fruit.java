package com.group.libraryapp.domain.fruit;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Fruit {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column
    private LocalDate warehousingDate;
    @Column(nullable = false)
    private long price;
    @ColumnDefault("0")
    private int salesYN;


    protected Fruit() {};

    public Fruit(String name, long price) {
        this.name = name;
        this.price = price;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSalesYN() {
        this.salesYN = 1;
    }
}
