package com.group.libraryapp.dto.user.response;

import com.group.libraryapp.domain.user.User;

public class UserResponse {

    private long id;
    private String username;
    private Integer age;

    public UserResponse(long id, User user) {
        this.id = id;
        this.username = user.getName();
        this.age = user.getAge();
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }
}
