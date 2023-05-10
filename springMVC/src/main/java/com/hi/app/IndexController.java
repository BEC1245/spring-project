package com.hi.app;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // 컨트롤럴 처리할거다 선언
@Log4j2
public class IndexController {

    // 만약 요청(request)이/가 /index로 들어오면 처리해주는 메서드 선언 (사용자 url 등록)
    // http://localhost:8080/index
    // 이 어노테이션 선언시 무조건 view 처리를 할거다 라고 선언 한거임
    @RequestMapping("/index")
    public String index(){

        log.info("/index getIndex() 작동 함다");

        // view 경로를 반환
        return "index"; // 이거가 prefix, suffix 없앤거 반환하는거
        // WEB-INf/views/member/index.jsp
    }
}
