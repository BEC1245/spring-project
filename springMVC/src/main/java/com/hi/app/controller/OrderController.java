package com.hi.app.controller;

import com.hi.app.domain.Address;
import com.hi.app.domain.OrederCommand;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    // 여기서도 dispatcher servlet이 읽은 컨테이너 객체는 webApplicationcontext 안 model 에 저장
    @PostMapping
    public String order(
            @ModelAttribute("order") OrederCommand command
        ){

        log.info("POST /order/order");

        log.info(command);

        return "order/order";

    }


}
