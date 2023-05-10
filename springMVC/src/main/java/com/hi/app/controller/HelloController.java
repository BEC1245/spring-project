package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Log4j2
@Controller
public class HelloController {

    // get이든 post이든 다 여기로 옴 구분X
    @RequestMapping("/hello")
    public ModelAndView hello(){
        // ModelAndView는 응답할 view의 경로및 공유할 결과 Data 를 저장해야함
        ModelAndView mav = new ModelAndView();

        // view의 경로를 설정해보자
        mav.setViewName("index.jsp"); // /WEB-INF/views/hello.jsp

        // attributeName = 전달할 데이터의 이름, attributeValue = 전달할 값
        mav.addObject("greeting", "hello");

        return mav;
    }

}
