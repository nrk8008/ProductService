package com.ecommerce.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends Base {
    private String title;
    private double price;
    private Category category;
}

