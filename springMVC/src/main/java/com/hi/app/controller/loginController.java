package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Log4j2
@Controller
@RequestMapping("/login")
// 만약 RequestMapping을 클래스 위에 선언이 되였다면
// 위의 경로가 기본 경로가 됨

public class loginController {


    // /login으로 get요청이 왔을경우
    @RequestMapping(method = RequestMethod.GET)
    public String loginForm(){

        log.info("get | /login");

        // forwordin
        return "/member/loginForm";
    }

    // /login으로 post요청이 왔을경우
    @RequestMapping(method = RequestMethod.POST)
    public String login(
            HttpServletRequest request,
            RedirectAttributes redirectAttributes
    ){

        log.info("post | /login");
        // post 처리후 redirection 처리
        // redirect 처리를 하려면 String으로 redirect: 선언후 context 경로를 제외하고 경로를 입력하면 됨

        //로그인 처리
        HttpSession session = request.getSession();
        session.setAttribute("loginInfo", "Login");
        log.info("로그인 처리");

        redirectAttributes.addAttribute("no", 10);
        redirectAttributes.addAttribute("page", 13);
        redirectAttributes.addAttribute("type", "user");

        return "redirect:/sample/sample1";
    }
}
