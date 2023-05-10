package com.example.demoman;

import lombok.*;

// Getter, Setter, AllArgsConstructor = lombok이 getter를 만들어주는 어노테이션
// AllArgsConstructor -> 모든 변수를 가진 생성자를 컴파일 시 만들어줌
// NOArgsConstructor -> 기본 생성자를 컴파일 시 만들어줌

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DeptDTO {

    private int deptno;
    private String dname;
    private String loc;

    public static void main(String[] args) {
        DeptDTO dto = new DeptDTO(1, "d", "d");

        System.out.println(dto.toString());
        dto.setDeptno(1233);
        dto.setLoc("no");
        System.out.println(dto.toString());

    }
}
