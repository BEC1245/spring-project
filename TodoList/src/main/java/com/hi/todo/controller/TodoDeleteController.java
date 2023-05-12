package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
public class TodoDeleteController {

    // delete
    @RequestMapping("/todo/delete")
    public String deleteTodo(Model model,
            @RequestParam(value = "tno", required = false) Integer tno
    ){

        if(tno == null){
            model.addAttribute("error",  "입력한 값이 없습니다");
            return "/todo/read";
        }

        log.info("in /todo/delete" + tno);

        log.info("just /todo/delete");
        return "redirect:/todo/list";
    }
}
