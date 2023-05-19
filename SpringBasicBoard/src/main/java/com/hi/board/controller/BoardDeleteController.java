package com.hi.board.controller;

import com.hi.board.service.BoardDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/board/delete")
public class BoardDeleteController {

    @Autowired
    BoardDeleteService deleteService;

    @GetMapping
    public String delete(
            HttpServletRequest request,
            @RequestParam("bno") int bno
    ){
        deleteService.deleteBoard(bno, request);
        return "redirect:/board/list";
    }

}
