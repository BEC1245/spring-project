package com.hi.demoman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/subPage")
public class subPageController {

    @GetMapping
    public void getForwording(
            @RequestParam("name") String name,
            @RequestParam("place") String place,
            Model model){

        model.addAttribute("getName", name);
        model.addAttribute("getPlace", place);

        if(!name.isEmpty() && name.equals("인천")){
            model.addAttribute("incheon", "인천에 사시는 군요!");
        }
    }

}
