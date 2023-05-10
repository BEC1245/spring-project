package org.example.dao;

import org.example.domain.Member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao implements Dao {

    // Map<key, value> Key : email, value : Member obj(class)
    private Map<String, Member> map = new HashMap<>();

    // member id increase variable
    private long nextId = 0; // insert(입력 시) nextId++

    // 삽입 메서드
    @Override
    public void insert(Member member) {
        member.setId(nextId++);
        map.put(member.getEmail(), member);
    }

    // 업데이터 메서드
    @Override
    public void update(Member member) {
        map.put(member.getEmail(), member);
    }

    // 이메일로 해당 정보 가져오기
    @Override
    public Member selectByEmail(String email) {
        return map.get(email);
    }

    public Collection<Member> selectAll(){
        return map.values();
    }
}
