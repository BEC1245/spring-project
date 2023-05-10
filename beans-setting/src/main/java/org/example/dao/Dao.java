package org.example.dao;

import org.example.domain.Member;

// Dao 라는 상위 인터페이스를 선언한 모습
public interface Dao {

    // 아래는 상속받은 클래스가 구현해야하는 기능을 알려주고 있다.
    public abstract void insert(Member member);

    void update(Member member);

    Member selectByEmail(String email);

}
