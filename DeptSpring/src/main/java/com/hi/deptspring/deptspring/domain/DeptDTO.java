package com.hi.deptspring.deptspring.domain;

import lombok.*;

@Data // -> @getter + @setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DeptDTO {

    private int deptno;
    private String dname;
    private String loc;

}
