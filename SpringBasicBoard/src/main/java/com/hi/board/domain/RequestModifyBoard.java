package com.hi.board.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RequestModifyBoard {

    private int bno;
    private String title;
    private String content;
    private String writer;
    private String oldfile;
    private MultipartFile file;
    private String filename;

}
