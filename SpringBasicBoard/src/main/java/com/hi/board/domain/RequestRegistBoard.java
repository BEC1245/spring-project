package com.hi.board.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RequestRegistBoard {

    private String title;
    private String content;
    private String writer;
    private MultipartFile file;
    private String filename; // DB에 저장할 파일 이름

}
