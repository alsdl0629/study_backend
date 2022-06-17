package com.example.test.repository;

import com.example.test.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<ProductEntity, Long> {
}
