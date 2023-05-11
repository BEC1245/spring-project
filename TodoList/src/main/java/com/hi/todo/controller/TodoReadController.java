package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class TodoReadController {

    @RequestMapping("/todo/read")
    public void get(Model model){
        // /WEB-INF/views/todo/read.jsp
        log.info("GET /todo/read");
        model.addAttribute("todo", "Todo");

    }

}
