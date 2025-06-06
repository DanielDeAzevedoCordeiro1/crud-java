package com.daniel.authapi.model;

public enum Role {
    ADMIN(1),USER(2);

    private final int value;

    Role(int value) {
        this.value = value;
    }

    public int getRole() {
        return value;
    }
}
