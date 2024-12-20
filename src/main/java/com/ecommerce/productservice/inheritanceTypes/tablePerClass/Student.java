package com.ecommerce.productservice.inheritanceTypes.tablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "tpc_students")
public class Student extends User {
    private double psp;

}
