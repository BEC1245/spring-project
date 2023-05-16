package com.hi.deptspring.deptspring.controller;

import com.hi.deptspring.deptspring.service.DeptDeleteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequestMapping("/dept/delete")
public class DeptDeleteController {

    @Autowired
    DeptDeleteService service;

    @GetMapping
    public String getDeleteDept(
            @RequestParam("no") int no
    ){

        log.info("GET /dept/delete");
        log.info(service.deleteDept(no));

        return "redirect:/dept/list";
    }
}
