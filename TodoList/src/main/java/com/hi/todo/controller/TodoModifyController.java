package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequestMapping("/todo/modify")
public class TodoModifyController {

    @GetMapping
    public String getModifyForm(Model model){

        log.info("GET /todo/modify");

        model.addAttribute("todo", "TODO");
        return "/todo/modifyForm";
        // /WEB-INF/views/todo/modifyForm
    }

    // data 받고 수정하고(modify) list로 이동
    @PostMapping
    public String post(){

        log.info("POST /todo/modify");

        return "redirect:/todo/list";
    }

}
