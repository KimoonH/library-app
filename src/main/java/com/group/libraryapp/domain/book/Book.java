package com.group.libraryapp.domain.book;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255, name = "name")
    private String name;

    protected Book() {}

    public Book(String name) {
        if(name == null) {
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다."));
        }
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
