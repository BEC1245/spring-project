package com.hi.board.interfaceMapper;

import com.hi.board.domain.RequestRegistBoard;
import com.hi.board.domain.boardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

     List<boardDTO> selectAll();

     boardDTO selectByBno(int bno);

     int insertBoard(RequestRegistBoard board);

}
