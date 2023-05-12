package com.hi.demoman.controllers;

import com.hi.demoman.dto.nameInfoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class AppController {

    @RequestMapping("/home")
    public String ShowHomePage(){
        return "welcome-page";
    }
    
    @RequestMapping("/process-homepage")
    public String showResultPage(nameInfoDTO nameInfoDTO, Model model){
        model.addAttribute("nameInfo", nameInfoDTO);
        return "result-page";
    }

}
