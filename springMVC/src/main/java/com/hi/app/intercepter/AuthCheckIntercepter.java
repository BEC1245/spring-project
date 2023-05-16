package com.hi.app.intercepter;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// 인터셉터를 행하는 객체
@Log4j2
public class AuthCheckIntercepter implements HandlerInterceptor {

    // servlet-context.xml에 등록하여 사용

    // 요청을 받을때 작동하는 메서드
    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) throws Exception {

        log.info(">>>>>>>>>>>>>> 회원 로그인 여부 채크 <<<<<<<<<<<<<<<");

        // session 획득 : 현재 세션이 존재하지 않으면 => null 반환
        HttpSession session = request.getSession(false);

        // 회원 판별 / 회원 로그인시 체그가 필요
        // 회원이 맞다면 return true -> 다음 인터셉터 혹은 컨트롤러로 보냄
        // session이 null이거나, getAttribute("loginInfo") null 이면 false -> 작동 중지

        if(session != null && session.getAttribute("loginInfo") != null){
            log.info("회원 로그인 체크 // 로그인 상태입니다.");
            return true;
        }
        log.info("회원 로그인 체크 // 로그인 상태가 아닙니다.");
        response.sendRedirect("/login");
        return false;
    }

    // 서버가 응답할 떼 작동하는 메서드
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {}

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);

        log.info("서버가 응답 했습니다");
    }
}
