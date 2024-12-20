package com.ecommerce.productservice.inheritanceTypes.tablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "tpc_mentors")
public class Mentor extends User {
    private String companyName;

}
