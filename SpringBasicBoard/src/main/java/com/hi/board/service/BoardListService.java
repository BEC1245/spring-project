package com.hi.board.service;

import com.hi.board.domain.BoardListPage;
import com.hi.board.domain.boardDTO;
import com.hi.board.interfaceMapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardListService {

    @Autowired
    BoardMapper boardMapper;

    private final int pageLimit = 3;
    private final int countPerPage = 5;

    public List<boardDTO> selectAllList(){
        return boardMapper.selectAll();
    }

    public BoardListPage getPage(int currentPage){
        List<boardDTO> list = boardMapper.selectList(((currentPage - 1) * countPerPage), countPerPage);
        int totalConunt = boardMapper.selectTotalcount();

        BoardListPage page = new BoardListPage(pageLimit, countPerPage, currentPage, list, totalConunt);

        return page;
    }

}
