package com.example.board1.controller;


import com.example.board1.dto.BoardDto;
import com.example.board1.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/member")
    public String createBoard(@RequestBody BoardDto boardDto) {
        boardService.
    }
}
