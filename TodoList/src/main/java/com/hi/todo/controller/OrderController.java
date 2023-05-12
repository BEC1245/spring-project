package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/order/order")
public class OrderController {

    // get : 입력 폼 화면
    @GetMapping
    public String getOrderForm(){
        log.info("GET /order/order ");
        return "/order/orderForm";
    }


    // post : 데이터를 받아서 화면에 겨로가를 출력하는



}
