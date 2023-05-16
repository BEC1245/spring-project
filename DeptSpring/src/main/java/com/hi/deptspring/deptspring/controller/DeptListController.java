package com.hi.deptspring.deptspring.controller;

import com.hi.deptspring.deptspring.service.DeptListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class DeptListController {

    // autowired의 문제 -> runtime시에 오류를 던질 수 있음
    // 그래서 final 통해서 상수화 하고 생성자를 만들는 처리를 할 수 있다
    // 이 생성자 안에는 spring이 해당 객체를 자동 주입을 해줘서 뭘 넣을 필요가 없다
    private final DeptListService service;

    public DeptListController(DeptListService service) {
        this.service = service;
    }

    @RequestMapping("/dept/list")
    public void getListPage(
            Model model
    ){

        log.info(service.getList());
        model.addAttribute("list", service.getList());
    }

}
