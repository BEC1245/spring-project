package com.hi.board.service;

import com.hi.board.domain.RequestModifyBoard;
import com.hi.board.interfaceMapper.BoardMapper;
import com.hi.board.utility.fileConverter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Log4j2
@Service
public class BoardModifyService {

    @Autowired
    private BoardMapper mapper;

    public int modifyBoard(
            RequestModifyBoard board,
            HttpServletRequest request
    ){
        MultipartFile image;

        //파일 저장
        if(board.getFile() != null && board.getFile().getSize() > 0){
            String fileUri = "/uploadFile/board";
            image = board.getFile();

            try
            {
                File file = fileConverter.convert(image.getOriginalFilename(), fileUri, request);
                image.transferTo(file);
                board.setFilename(file.getName());
            } catch (IOException e){
                board.setFilename(board.getOldfile());
                e.printStackTrace();
            }
        } else {
            board.setFilename(board.getOldfile());
        }

        log.info(board);
        return mapper.updateBoard(board);
    }

}
