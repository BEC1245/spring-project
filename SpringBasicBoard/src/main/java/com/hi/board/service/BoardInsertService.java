package com.hi.board.service;

import com.hi.board.domain.RequestRegistBoard;
import com.hi.board.interfaceMapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class BoardInsertService {

    @Autowired
    private BoardMapper test;

    public int insertBoard(RequestRegistBoard board){

        return test.insertBoard(board);
    }

}
