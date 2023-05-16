package com.hi.deptspring.deptspring.mapper;

import org.apache.ibatis.annotations.Mapper;

// 인터페이스를 구현 한다
// 이 파일의 위치는 전달할 xml에 넣어야 한다
@Mapper
public interface TimeMapper {
    String getTime(); // 구현체
}
