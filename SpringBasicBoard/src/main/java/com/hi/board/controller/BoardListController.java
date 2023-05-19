package com.hi.board.controller;

import com.hi.board.domain.BoardListPage;
import com.hi.board.domain.boardDTO;
import com.hi.board.service.BoardInsertService;
import com.hi.board.service.BoardListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/board/list")
public class BoardListController {

    @Autowired
    BoardListService listService;


    @GetMapping
    public void getView(
            Model model
    ){


        model.addAttribute("list", listService.selectAllList());
    }
}
