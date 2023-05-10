package org.example.main;

import org.example.domain.RegisterRequest;
import org.example.service.ChangePasswordService;
import org.example.service.MemberRegisterService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class MemberManagerSpringMain2 {

    // 조립기 : 객체를 관리(생성, 주입, 제공...)
    static GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:addCtx.xml");
    // 만약 xml클래스에 bean 에 클래스만 넣고
    // 아무런 처리를 안 했을 경우
    // 그냥 null 처리 해버림 == runtime error

    public static void main(String[] args) {
        // 객체 비교 -> 참조값 비교

        MemberRegisterService service1 =
                ctx.getBean("memberRegisterService", MemberRegisterService.class);

        ChangePasswordService service2 =
                ctx.getBean("changePasswordService", ChangePasswordService.class);

        System.out.println("service 1 <==> service : " + (service1.equals(service2)));
    }

}
