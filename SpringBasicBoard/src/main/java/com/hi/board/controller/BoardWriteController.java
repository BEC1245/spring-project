package com.hi.board.controller;

import com.hi.board.domain.RequestRegistBoard;
import com.hi.board.service.BoardInsertService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequestMapping("/board/write")
public class BoardWriteController {

    @Autowired
    BoardInsertService insertService;

    @GetMapping
    public void getWriteForm(){}

    @PostMapping
    public String postVariable(
            RequestRegistBoard board
    ){

        log.info("GET /board/write");
        log.info(board);
        insertService.insertBoard(board);


        return "redirect:/board/list";
    }

}
