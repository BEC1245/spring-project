package com.hi.deptspring.deptspring.domain;

import lombok.*;

@Data // -> @getter + @setter
@Builder // 빌터 패턴을 구현해 놓은 어노테이션 -> 원하는 데이터만 넣어서 생성할 수 있게만 들어줌
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DeptDTO {

    private int deptno;
    private String dname;
    private String loc;

}
