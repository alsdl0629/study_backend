package com.example.board1.service;


import com.example.board1.domain.Board;
import com.example.board1.dto.BoardDto;
import com.example.board1.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void createBoard(BoardDto boardDto) {
        boardRepository.save(boardDto);
    }

    public Optional<Board> getBoard(Long id) {
       Board board = boardRepository.findById(id);
    }

}
