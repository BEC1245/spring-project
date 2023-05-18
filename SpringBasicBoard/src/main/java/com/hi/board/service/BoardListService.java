package com.hi.board.service;

import com.hi.board.domain.boardDTO;
import com.hi.board.interfaceMapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardListService {

    @Autowired
    BoardMapper boardMapper;

    public List<boardDTO> selectAllList(){
        return boardMapper.selectAll();
    }

}
