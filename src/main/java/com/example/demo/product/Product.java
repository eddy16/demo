package com.example.demo.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Edgar on 10/09/2017.
 */
@Data
@Document
public class Product {
    private String id;
    private String name;
    private String price;
    private String brand;

    public Product(String name, String price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }
}
