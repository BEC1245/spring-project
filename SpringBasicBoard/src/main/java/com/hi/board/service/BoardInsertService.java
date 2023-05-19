package com.hi.board.service;

import com.hi.board.domain.RequestRegistBoard;
import com.hi.board.interfaceMapper.BoardMapper;
import com.hi.board.utility.fileConverter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

@Log4j2
@Service
public class BoardInsertService {

    @Autowired
    private BoardMapper test;



    public int insertBoard(HttpServletRequest request, RequestRegistBoard board){
        // DB에 저장할 파일이름을 만들고 전달
        MultipartFile getFile;

        // 파일이 존제 하면 파일을 저장
        if(board.getFile() != null && board.getFile().getSize() > 0){
            String weburi = "/uploadFile/board";
            getFile = board.getFile();

            try {
                File file = fileConverter.convert(getFile.getOriginalFilename(), weburi, request);
                board.getFile().transferTo(file);

                board.setFilename(file.getName());
            } catch (IOException e){
                /*throw new RuntimeException(e); 강제로 오류 발생*/
                log.info("file upload failed");
            }
            log.info("file upload success");
        }

        return test.insertBoard(board);
    }

}