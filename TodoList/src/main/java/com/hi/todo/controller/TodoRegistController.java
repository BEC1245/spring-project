package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Log4j2
@Controller
@RequestMapping( "/todo/regist")
public class TodoRegistController {

    // get : from이 보이는 페이지로 이동
    @GetMapping
    public String get(){
        log.info("GET /todo/regist");

        // /WEB-INF/views/todo/registForm.jsp
        return "todo/registForm";
    }

    // post : redirect -> /todo/list, view 필요가 읍다.

    @PostMapping
    public String post(){

        log.info("POST /todo/regist");

        return "redirect:/todo/list"; // 일반 view와 구분은 redirect: 문자열로 구분
    }
}
