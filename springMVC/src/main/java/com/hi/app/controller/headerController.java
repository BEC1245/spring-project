package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class headerController {

    @RequestMapping("/header/check")
    public String headerCheck(
            @RequestHeader("Host") String host,
            @RequestHeader(value = "test", defaultValue = "noting",required = false) String test
        ){

        log.info("/header/check");

        log.info("requestHeader : host = " + host);
        log.info("requestHeader : test = " + test);

        return "/header/check";

    }

}
