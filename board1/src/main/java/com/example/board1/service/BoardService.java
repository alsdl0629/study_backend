package com.example.board1.service;


import com.example.board1.dto.BoardDto;
import com.example.board1.entity.BoardEntity;
import com.example.board1.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void createBoard(Long id, String password) {

        boardRepository.save(BoardEntity.builder()
                .id(id)
                .password(password)
                .build());
    }

    public BoardEntity getBoard(Long id) {
        BoardEntity boardEntity = boardRepository.findById()
    }

}
