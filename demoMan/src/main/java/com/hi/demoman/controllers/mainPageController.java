package com.hi.demoman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mainPage")
public class mainPageController {

    @GetMapping
    public void getMainPage(Model model){
        model.addAttribute("title", "welcome to main page");
        sendAttributeMessage();
    }

    @ModelAttribute("send")
    public String sendAttributeMessage(){
        return "sended by sendAttributeMessage";
    }

}