package org.example.service;

import org.example.dao.Dao;
import org.example.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ChangePasswordService {

    @Autowired
    @Qualifier("member")
    private Dao dao;

//    public ChangePasswordService(Dao dao) {
//        this.dao = dao;
//    }

    // 이메일, 현비번, 새비번 을 받아 데이터를 변경시켜누즞 메서드
    public void changePassword(String email, String oldPW, String newPW){

        //1. 이메일로 저장된 회원 정보가 있는지 판다. => selectByEmail
        Member member = dao.selectByEmail(email);

        // 만약 입력한 email의 정보가 없을 경우
        if(member == null){
            // 존제하지않은 회원
            System.out.println("존제하지 않은 회원 정보입니다.");
            return;
        }

        // 비번 변경 처리
        member.changePassword(oldPW, newPW);
        dao.update(member);
    }
}
