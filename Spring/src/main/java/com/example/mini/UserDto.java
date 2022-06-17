package com.example.mini;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserDto {

    private Long id;
    private String password;

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
