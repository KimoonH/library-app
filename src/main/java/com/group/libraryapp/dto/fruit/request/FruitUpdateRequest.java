package com.group.libraryapp.dto.fruit.request;

public class FruitUpdateRequest {

    private long id;

    public FruitUpdateRequest() {
    }

    public FruitUpdateRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
