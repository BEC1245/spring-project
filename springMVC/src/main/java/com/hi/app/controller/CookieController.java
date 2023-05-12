package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Log4j2
@Controller
@RequestMapping("/cookie") // 경로
public class CookieController {

    // /cookie/make
    // spring은 쿠키를 자동으로 만들어주거나 그런 어노테이션은
    // 지원을 안하여 전애 배웠던 httpServletResponse를 사용 해야한다.
    @RequestMapping(value = "/make")
    public String getMakeCookie(
            HttpServletResponse response
    ){
        // 쿠키는 클라 쪽에서 저장할 수 있었던 작은 문자열이였음
        // 저장방식 -> map 형식
        Cookie cookie = new Cookie("userid", "cool");
        cookie.setPath("/"); // 어디에서 쿠키를 불러올지
        cookie.setMaxAge(60 * 60);  // 초단위 쿠키 생명시간

        response.addCookie(cookie);
        // 쿠키 생성및 응답

        return "/cookie/make";
    }

    @RequestMapping("/view")
    public String viewCookie(
            @CookieValue("userid") String userid, // 이게 쿠키의 이름을 가지고 값을 받는 어노테이션

            // 만약 해당하는 쿠키 값이 없으면 400 에러를 때림, 그래서 required 처리해야함
            // 당연히 해당 쿠키가 없는 상태에서 defaultValue 처리는 그냥 변수 값만 바꾸는 거고 쿠키를 추가하는 것이 아님
            @CookieValue(value = "auth", defaultValue = "not", required = false) String auth,

            // 요청한 header값을 가져옴
            @RequestHeader("Connection") String referer,
            Model model
    ){

        log.info("GET        /cookie/view");
        log.info("cookie : userid = " + userid);

        log.info("cookie  : auth = " + auth);

        log.info("이전 패이지 : " + referer);

        // 쿠키는 커멘드 객체같은 것이 아니라 어트리뷰트로 전달 해야함.
        model.addAttribute("userid", userid);
        model.addAttribute("auth", auth);

        return "cookie/view";
    }

}
