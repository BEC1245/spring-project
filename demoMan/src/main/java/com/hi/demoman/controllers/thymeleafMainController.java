package com.hi.demoman.controllers;

import com.hi.demoman.domain.exampleDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/test/main")
public class thymeleafMainController {

    @GetMapping
    public String get(){

        return "/test/thymeleafMain";

    }

}
