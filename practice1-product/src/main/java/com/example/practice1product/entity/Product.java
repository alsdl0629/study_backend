package com.example.practice1product.entity;

import com.example.practice1product.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private Long id;

    private String productName;

    private Long productStock;

    public ProductDto toDto() {
        return ProductDto.builder()
                .id(id)
                .productName(productName)
                .productStock(productStock)
                .build();
    }
}
