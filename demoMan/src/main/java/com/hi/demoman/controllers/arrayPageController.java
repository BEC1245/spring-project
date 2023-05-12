package com.hi.demoman.controllers;

import com.hi.demoman.domain.array;
import com.hi.demoman.domain.infoList;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/array")
public class arrayPageController {

    @GetMapping
    public void getArrayPage(array info){
        log.info(info.getList().get(0).getCity());
        log.info(info.getList().get(0).getName());
    }

    @PostMapping
    public String PostArrayInfo(infoList info, Model model){

        model.addAttribute("list", info);
        return "/result";
    }

}
