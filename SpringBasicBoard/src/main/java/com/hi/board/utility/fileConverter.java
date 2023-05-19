package com.hi.board.utility;

import lombok.extern.log4j.Log4j2;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@Log4j2
public class fileConverter {

    public static File convert(String name, String loc, HttpServletRequest request){

        // UUID.randomUUID -> 랜덤한 값을 줌 : 중복된 이미지 이름을 중복되지 않도록 처리
        String fileName = UUID.randomUUID().toString();

        log.info(fileName);

        String realLoc = request.getSession().getServletContext().getRealPath(loc);
        return new File(realLoc, fileName + name);
    }

    public static File getfile(String name, String loc, HttpServletRequest request){
        String realLoc = request.getSession().getServletContext().getRealPath(loc);
        return new File(realLoc, name);
    }

}
