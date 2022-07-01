package com.example.practice1product.repository;

import com.example.practice1product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByProductName(String name);


}
