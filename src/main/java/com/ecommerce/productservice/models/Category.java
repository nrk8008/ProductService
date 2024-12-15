package com.ecommerce.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Category {
    private String name;
    private String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
