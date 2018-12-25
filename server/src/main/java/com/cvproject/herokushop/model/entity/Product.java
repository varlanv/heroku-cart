package com.cvproject.herokushop.model.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String country;
    private String manufactorer;

    public Product(){}

    public Product(String name, String country, String manufactorer) {
        this.name = name;
        this.country = country;
        this.manufactorer = manufactorer;
    }


    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", manufactorer='" + manufactorer + '\'' +
                '}';
    }
}
