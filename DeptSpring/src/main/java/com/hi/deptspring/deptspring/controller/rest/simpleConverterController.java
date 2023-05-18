package com.hi.deptspring.deptspring.controller.rest;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Log4j2
@Controller
@RequestMapping("/mc/simple")
public class simpleConverterController {

    @GetMapping
    public void form(){
        log.info("GET /mc/simple.... Form");
    }

    @PostMapping

    // 데이터를 날것 그대로 전달
    @ResponseBody
    public String simple(
            // 데이터를 날것 그대로 받음
        @RequestBody String body
    ){
        log.info(body);


        return "body >>>>>> ";
    }

}
