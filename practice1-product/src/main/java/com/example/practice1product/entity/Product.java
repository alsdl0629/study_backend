package com.example.practice1product.entity;

import com.example.practice1product.dto.ProductDto;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Product {

    @Id
    private Long id;
    @NotNull
    private String productName;
    @NotNull
    private Long productStock;

}
