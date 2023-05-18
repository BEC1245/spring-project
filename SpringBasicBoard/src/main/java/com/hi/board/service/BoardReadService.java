package com.hi.board.service;

import com.hi.board.domain.boardDTO;
import com.hi.board.interfaceMapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardReadService {

    @Autowired
    BoardMapper boardMapper;

    public boardDTO selectByBno(int bno){
        return boardMapper.selectByBno(bno);
    }

}
