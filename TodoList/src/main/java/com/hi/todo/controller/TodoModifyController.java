package com.hi.todo.controller;

import com.hi.todo.domain.ModifyTodoRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    // ModelAttribute 추가 기능 -> 메서드에 사용하여 return값을 전방적으로 공유해준다.
    @PostMapping
    public String post(
           @ModelAttribute("modifyData") ModifyTodoRequest request
    ){

        log.info("POST /todo/modify");
        postingdata(request.getTodo());
        return "todo/modify";

        //return "redirect:/todo/list";
    }

    // 해당 객체를 선언하고 실행하면 (다른 request, responce 처리를 하는 메서드에서)
    // return 타입을 spring model에 넣어줘 view에서 사용이 가능하게 만들어 준다
    @ModelAttribute("strData") // 이게 view에서 불러올 이름이 된다.
    public String postingdata(String name){
        String ReturnVal = "input value : " + name;

        log.info(ReturnVal);

        return ReturnVal;
    }

}
