package com.hi.board.service;

import com.hi.board.domain.boardDTO;
import com.hi.board.interfaceMapper.BoardMapper;
import com.hi.board.utility.fileConverter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Log4j2
@Service
public class BoardDeleteService {

    @Autowired
    BoardMapper mapper;

    public int deleteBoard(int bno, HttpServletRequest request){

        // 삭제 대상의 파일 이름을 휙득
        String deleteFileName = mapper.selectByBno(bno).getFile();

        // DB 정상 삭제후
        int result = mapper.deleteBoard(bno);

        // 파일 삭제
        if(!deleteFileName.isEmpty()){
            String uri = "/uploadFile/board";
            File file = fileConverter.getfile(deleteFileName, uri, request);
            if(file.exists()) {
                log.info("file deleted state -> " + file.delete());
            }
        }

        return result;
    }

}
