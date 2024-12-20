package com.ecommerce.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends Base {
    private String title;
    private double price;
    @ManyToOne
    private Category category;
}

/*
1                   1
Product ------- Category == > M:1 cardinality
M                   1
we have to add Category Id on Product side.
*/