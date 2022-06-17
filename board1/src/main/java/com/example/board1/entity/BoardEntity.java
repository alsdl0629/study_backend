package com.example.board1.entity;

import com.example.board1.dto.BoardDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "board")
public class BoardEntity {
    @Id
    private Long id;
    private String password;


    public BoardDto toDto() {
        return BoardDto.builder()
                .id(id)
                .password(password)
                .build();
    }
}
