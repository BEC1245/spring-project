package com.hi.deptspring.deptspring.controller;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.service.DeptModifyService;
import com.hi.deptspring.deptspring.service.DeptReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequestMapping("/dept/modify")
public class DeptModifyController {

    private final DeptReadService readService;
    private final DeptModifyService modifyService;

    DeptModifyController(DeptReadService readService, DeptModifyService modifyService){
        this.readService = readService;
        this.modifyService = modifyService;
    }

    @GetMapping
    public String getModifyForm(
            @RequestParam("no") int deptno,
            Model model
    ){

        model.addAttribute("dept", readService.getDept(deptno));

        log.info("GET /dept/modify");

        return "/dept/modifyForm";
    }

    @PostMapping
    public String modify(
        DeptDTO deptDTO
    ){

        log.info("post /dept/modify");
        log.info(deptDTO);

        modifyService.modifyDept(deptDTO);

        return "redirect:/dept/list";
    }
}
