package org.example.assembler;

import org.example.dao.MemberDao;
import org.example.service.ChangePasswordService;
import org.example.service.MemberRegisterService;

// 각각의 Service 기능을 Assembler라는 하나의 객체에 담아
// 인스턴스가 필요할 때 불러와 주는 역할
// 컨테이너와 유사하다.
public class Assembler {

    // 객체를 저장하고 있고,
    // 저장된 객체를 제공 기능
    // 제공하는 객체는 이미 만들어 놓은 객체를 제공 : singleton 효과
    // 컨테이너 : 객체를 생성, 제공, 소멸

    // MemberDao, MemberRegisterService, ChangePasswordService
    // 의 객체도 가지고 있어야함

    private MemberDao memberDao;
    private MemberRegisterService registerService;
    private ChangePasswordService passwordService;

    public Assembler(){
        memberDao = new MemberDao();
        registerService = new MemberRegisterService(memberDao);
        passwordService = new ChangePasswordService(memberDao);
    }

    public MemberDao getMemberDao() {
        return memberDao;
    }

    public MemberRegisterService getRegisterService() {
        return registerService;
    }

    public ChangePasswordService getPasswordService() {
        return passwordService;
    }
}
