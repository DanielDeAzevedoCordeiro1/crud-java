package com.daniel.authapi.dto;

public record ProductRequestDTO(String name, String description, Double price, String category) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public Double price() {
        return price;
    }

    @Override
    public String category() {
        return category;
    }
}
