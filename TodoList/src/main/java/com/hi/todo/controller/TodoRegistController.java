package com.hi.todo.controller;

import com.hi.todo.domain.TodoRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

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
    public String post(
        Model model,
        @RequestParam(value = "todo", required = false) String todo,
        @RequestParam(value = "duedate", required = false) String duedate,
        @ModelAttribute("Giveing") TodoRequest dto
    ){

        LocalDate date = LocalDate.now();
        if(duedate.isEmpty()){
            duedate = date.toString();
        }

        if(dto.getDuedate().isEmpty()){
            dto.setDuedate(date.toString());
        }

        log.info("POST /todo/regist");
        log.info(dto.toString());

        model.addAttribute("todo", todo);
        model.addAttribute("duedate", duedate);

        // command 클래스 정의 : 파라미터를 받는 변수
        // Controller 메소드의 매개변수로 정의
        //model.addAttribute("dto", dto);

        //return "/todo/regist";

        return "redirect:/todo/list"; // 일반 view와 구분은 redirect: 문자열로 구분
    }
}
