package com.hi.deptspring.deptspring.domain;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DeptSearchOption {

    private String searchType;
    private String keyword;

}
