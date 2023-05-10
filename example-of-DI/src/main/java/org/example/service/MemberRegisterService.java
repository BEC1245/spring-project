package org.example.service;

import org.example.dao.Dao;
import org.example.domain.Member;
import org.example.domain.RegisterRequest;

import java.util.Date;

public class MemberRegisterService {

    private Dao dao;

    // 생성자를 통해서 생성자를 주입
    public MemberRegisterService(Dao dao){
        this.dao = dao;
    }

    // 등록 처리해주는 메서드를 만들자 :
    // RegisterRequest (email, password, confirmPassword, name)
    public void regist(RegisterRequest request) {

        // 이메일 존제 여부 확인 : map 저장시 email key 값으로 사용
        Member member = dao.selectByEmail(request.getEmail()); // member or null

        // 만약 해당하는 이메일이 데이터로 존제할 경우
        if(member != null){
            System.out.println("중복되는 이메일이 있습니다.");
            return;
        }

        // 데이터 저장은 newMamber
        // 전달받은 형태는 request 형태
        Member newMember = new Member();
        newMember.setEmail(request.getEmail());
        newMember.setEmail(request.getPassword());
        newMember.setName(request.getName());
        newMember.setRegDate(new Date());

        //dao => 저장 요청
        dao.insert(newMember);
    }
}
