package com.hi.board.controller;

import com.hi.board.service.BoardReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board/read")
public class BoardReadController {

    @Autowired
    private BoardReadService readService;

    @GetMapping
    public void getReader(
            @RequestParam("bno") int bno,
            Model model
    ){
        model.addAttribute("page", readService.selectByBno(bno));
    }

}
