package com.hi.board.controller;

import com.hi.board.domain.RequestModifyBoard;
import com.hi.board.domain.boardDTO;
import com.hi.board.service.BoardModifyService;
import com.hi.board.service.BoardReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@Controller
@RequestMapping("/board/modify")
public class BoardModifyController {

    @Autowired
    BoardModifyService modifyService;

    @Autowired
    BoardReadService readService;

    @GetMapping
    public void modifyForm(
            @RequestParam("bno") int bno,
            Model model
    ){
        model.addAttribute("board", readService.selectByBno(bno));
    }

    @PostMapping
    public String modify(
            HttpServletRequest request,
            RequestModifyBoard board
    ){

        modifyService.modifyBoard(board, request);


        return "redirect:/board/list";
    }

}
