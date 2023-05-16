package com.hi.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorTestController {

    // 오류 발생기
    @RequestMapping("/errortest")
    public String getError(){

        String str = null;
        str.toString();

        return "에러 발동혀";
    }

}
