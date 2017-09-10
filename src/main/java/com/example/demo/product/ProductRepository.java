package com.example.demo.product;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Edgar on 10/09/2017.
 */
public interface ProductRepository extends MongoRepository<Product,String> {
}
