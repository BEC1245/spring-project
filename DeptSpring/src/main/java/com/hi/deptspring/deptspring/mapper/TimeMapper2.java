package com.hi.deptspring.deptspring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

// 인터페이스를 구현 한다
// 이 파일의 위치는 전달할 xml에 넣어야 한다
@Mapper
public interface TimeMapper2 {

    @Select("select now()") // 이런 식으로 직업 interface에 sql에 넣을 수 있음
    String getTime(); // 구현체
}
