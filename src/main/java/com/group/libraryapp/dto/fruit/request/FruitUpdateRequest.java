package com.group.libraryapp.dto.fruit.request;

public class FruitUpdateRequest {

    private long id;
    private String name;

    public FruitUpdateRequest() {
    }

    public FruitUpdateRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
