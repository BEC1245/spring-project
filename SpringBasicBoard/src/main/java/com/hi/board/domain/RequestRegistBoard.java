package com.hi.board.domain;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RequestRegistBoard {

    private String title;
    private String content;
    private String writer;

}
