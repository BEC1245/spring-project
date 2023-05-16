package com.hi.app.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@Log4j2
@ControllerAdvice
public class CommonExceptionAdvice {

    // 해당 예외가 발생하면 실행되는 메서드
    @ResponseBody // 응답하는 문자열 그대로 응답으로 사용
    @ExceptionHandler(Exception.class)
    public String exception(Exception exception){

        log.info(exception.getMessage());

        // 문자열을 받을 공간을 설정
        StringBuffer buffer = new StringBuffer();
        buffer.append("<h1>"+ exception.getMessage() +"</h1>");
        buffer.append("<hr>");

        // 그 오류의 발생 위치를 array형식으로 받는 getStackTrace메서드를 사용
        StackTraceElement[] stackTraceElements = exception.getStackTrace();

        // 모든 위치를 저장한 뒤에
        for (StackTraceElement print : stackTraceElements){
            buffer.append("<div>" + print + "</div>");
        }

        // 택스트로 출력한다.
        return buffer.toString(); // 이렇게 택스트로 줌
    }


    @ExceptionHandler(NoHandlerFoundException.class) // 이걸로 에러나면 실행할 거라는 걸 명시
    @ResponseStatus(HttpStatus.NOT_FOUND) // 이걸로 어떤 에러가 나면 실행할 거라는 것 명시
    public String notFound(){
        return "custom404";
    }



}