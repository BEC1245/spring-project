package com.hi.board.domain;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class boardDTO {

    private int bno;
    private String title;
    private String content;
    private String writer;
    private String regdate;
    private String updatedate;

}
