package com.example.board1.controller.dto;

import com.example.board1.domain.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDto {

    private Long id;

    private String password;

    public Board toEntity() {
        return Board.builder()
                .id(id)
                .password(password)
                .build();
    }
}
