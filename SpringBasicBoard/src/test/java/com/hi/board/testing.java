package com.hi.board;

import com.hi.board.domain.RequestRegistBoard;
import com.hi.board.interfaceMapper.BoardMapper;
import com.hi.board.service.BoardInsertService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Log4j2
/*@ExtendWith(SpringExtension.class) // 자동으로 주입을 해주는 넘
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/config/root-context.xml") // 설정을 수동으로 주입해주는 어노테이션*/
public class testing {

 /*   @Autowired(required = false)
    private BoardMapper mapper;

    @Autowired(required = false)
    private BoardInsertService service;
*/
    /*@Test
    public void mapperTest(){

        log.info(mapper.selectByBno(1));
    }*/

    @Test
    public void file(){

        String fileName = UUID.randomUUID().toString();
        log.info(fileName);

        /*File file = new File("C:\\Users\\hi\\Pictures\\Screenshots\\스크린샷(1).png");
        MultipartFile image = (MultipartFile) file;*/

    }

}
