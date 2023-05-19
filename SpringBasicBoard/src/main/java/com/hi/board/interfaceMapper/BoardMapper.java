package com.hi.board.interfaceMapper;

import com.hi.board.domain.RequestModifyBoard;
import com.hi.board.domain.RequestRegistBoard;
import com.hi.board.domain.boardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BoardMapper {

     List<boardDTO> selectList(int startNum, int count);

     List<boardDTO> selectAll();

     int selectTotalcount();

     boardDTO selectByBno(int bno);

     int insertBoard(RequestRegistBoard board);

     int updateBoard(RequestModifyBoard board);

     int deleteBoard(int bno);

}
