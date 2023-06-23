package com.example.demo.product.presentation;

import com.example.demo.product.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    @GetMapping("/products")
    public List<Product> getProducts(){
        return List.of(
                new Product( "Product 1","Description 2",100),
                new Product("Product 2", "Description 2",111),
                new Product("Product 3","Description 2",222)
        );
    }

}

