package com.hi.app.controller;

import com.hi.app.domain.UserReport;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Log4j2
@Controller
@RequestMapping("/date")
public class DateConverterController {

    @GetMapping
    public String getDateform(){

        return "/dateform";
    }

    @PostMapping
    public String date(
            @RequestParam("date") LocalDate date,
            UserReport report,
            Model model
    ){
        log.info("get date : " + date.toString());
        log.info("in userReport : " + report.getDate().toString());
        model.addAttribute("date", date);

        return "date";
    }

}
