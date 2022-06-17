package com.example.project1.entity;

import com.example.project1.dto.ProjectDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project")
public class ProjectEntity {

    @Id
    String product;
    String order;
    String orderList;

    public ProjectDto toDto() {
        return ProjectDto.builder()
                .product(product)
                .order(order)
                .orderList(orderList)
                .build();
    }

}
