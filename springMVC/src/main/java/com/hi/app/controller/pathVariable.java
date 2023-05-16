package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller

// {}안에 데이터를 넣어 변수를 선언
@RequestMapping("member/{type}/{idx}") //http://loaclhost:8080/member/10
public class pathVariable {

    @GetMapping
    public String getMemberInfo(
            @PathVariable("idx") String idx, // 선언된 변수의 값을 가져옴
            @PathVariable("type") String type,
            Model model
    ){

        log.info("idx :" + idx);
        log.info("type :" + type);
        model.addAttribute("idx", idx);
        model.addAttribute("type", type);

        return "/member/info";
    }

}
