package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Edgar on 10/09/2017.
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getProduct(String id) {
        return productRepository.findOne(id);
    }

    public Product createProduct(Product product) {
        return productRepository.insert(product);
    }
}
