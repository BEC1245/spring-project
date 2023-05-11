package com.hi.todo;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class IndexController {

    @RequestMapping("/index")
    public void getIndex(){
        log.info("/getIndex");
        // view path : /WEB-INF/views/index.jsp
    }

}
