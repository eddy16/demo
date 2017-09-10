package com.example.demo;

import com.example.demo.product.Product;
import com.example.demo.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner{

	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		productService.createProduct(new Product("Papas", "5", "Sabritas"));
		productService.createProduct(new Product("Refresco", "6", "Coca"));
		productService.createProduct(new Product("Paleta", "7", "Anita"));
	}
}
