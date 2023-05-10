package org.example.main;

import org.example.domain.RegisterRequest;
import org.example.service.ChangePasswordService;
import org.example.service.MemberRegisterService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class MemberManagerSpringMain1 {

    // 조립기 : 객체를 관리(생성, 주입, 제공...)
    static GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:addCtx1.xml");
    // 만약 xml클래스에 bean 에 클래스만 넣고
    // 아무런 처리를 안 했을 경우
    // 그냥 null 처리 해버림 == runtime error

    public static void main(String[] args) {
        // 사용자 메뉴 입력

        Scanner sc = new Scanner(System.in);
        String command;

        while(true){
            System.out.println("명령어를 입력해주세여");
            command = sc.nextLine();

            System.out.println(command.equals("exit"));
            // 명령어르 받는 부분
            // .startsWith 는 만약 문자열의 시작 문자가 들어온 문자와 같을때 true
            if(command.equals("exit")){
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (command.startsWith("new ")) {
                // 한줄 단위로 구분
                // new      이메일     비번 비번확인 이름
                // new cool@gmail.com 1111 1111 cool

                // 문자열을 나눠주는 split
                String[] commandStr = command.split(" ");

                // 입력 요청
                newCommand(commandStr);

            } else if (command.startsWith("change ")){

                changeCommand(command.split(" "));
            }
        }

        // 한줄 단위로 구분
        // new      이메일     비번 비번확인 이름
        // new cool@gmail.com 1111 1111 cool

        // change 이메일 oldPW newPW

        // exit : 프로그램을 종료시키는 형태


    }

    // 입력 메서드
    static void newCommand(String[] strs){

        // 전달받는 문자열의 크기는 5여야 된다.
        if(strs.length != 5){
            System.out.println("입력 처리 부족 ");
            return;
        }

        MemberRegisterService registerService =
                ctx.getBean("memberRegisterService", MemberRegisterService.class);
        // 선언한 ctx를 활용하여 spring container의 bean 안의
        // MemberRegisterService 를 주입 시켜준다.

        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setEmail(strs[1]);
        registerRequest.setPassword(strs[2]);
        registerRequest.setConfirmPassword(strs[3]);
        registerRequest.setName(strs[4]);

        System.out.println(registerRequest.isConfirmPassword());
        if(!registerRequest.isConfirmPassword()){
            System.out.println("비밀번호와 확인 비번이 올치 않습니다.");
        }


        registerService.regist(registerRequest);

    }

    // 변경 메서드
    static void changeCommand(String[] strs){

        // 전달받는 문자열의 크기는 4여야 된다.
        if(strs.length != 4){
            System.out.println("데이터를 더 추가 했거나 덜 추가 했습니다");
            return;
        }

        ChangePasswordService passwordService =
                ctx.getBean("changePasswordService", ChangePasswordService.class);
        // 이것도 똑같이 스프링 컨테이너 내부에 선언 되였던 ChangePAsswordService를 가져와
        // 생성자에 memberDao 를 주입 당한 인스턴스를 불러와 준다

        passwordService.changePassword(strs[0], strs[1], strs[2]);
    }

}
