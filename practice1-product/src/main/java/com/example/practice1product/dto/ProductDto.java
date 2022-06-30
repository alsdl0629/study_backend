package com.example.practice1product.dto;

import com.example.practice1product.entity.Product;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter @Setter
public class ProductDto {

    private Long id;
    private String productName;
    private Long productStock;

    public Product toEntity() {
        return Product.builder()
                .id(id)
                .productName(productName)
                .productStock(productStock)
                .build();
    }
}
