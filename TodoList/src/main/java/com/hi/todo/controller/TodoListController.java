package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class TodoListController {

    // 경로 설정
    // http://localhost:8080/todo/list.jsp
    @RequestMapping("/todo/list")
    public void getTodoList(Model model){

        log.info("/todo/list");

        // view로 결과 데이터 공유
        model.addAttribute("todoList", "put the info");
    }


}
