package com.hi.board.domain;

import lombok.Builder;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class BoardListPage {

    // 패이지를 수용할 최대 개수
    private int pageLimit;

    // 페이지 당 출력할 게시물의 개수 -
    private int countPerPage;

    // 현제 패이지 번호
    private int currentPageNum; // 전달 받를 데이터

    // 개시물의 리스트 List<BoardDTO> :
    private List<boardDTO> list; // 받을 데이터

    // 전체 게시물의 개수 // 받을 데이터
    private int totalCount;

    // 패이징 시작 번호
    private int startNum;

    // 패이진 끝 번호
    private int endNum;

    // 이전 버튼 출력 유무
    private boolean prev;

    // 다음 버튼 출력 유무
    private boolean next;

    public BoardListPage(int pageLimit, int countPerPage, int currentPageNum, List<boardDTO> list, int totalCount) {
        this.countPerPage = countPerPage;
        this.currentPageNum = currentPageNum;
        this.list = list;
        this.totalCount = totalCount;
        this.pageLimit = pageLimit;
    }

    private void calPageInfo(){
        // 끝 번호
        this.endNum = (int)(Math.ceil(this.currentPageNum * 1.0 / pageLimit) * pageLimit); // -> Math.ceil(현제 값 / 10) * 10 -> 10은 패이지를 수용할 최대 개수

        int realEndNum = (int)Math.ceil(this.totalCount * 1.0 / countPerPage); // -> 전체 값 / 표시될 게시물의 값

        this.endNum = Math.min(realEndNum, this.endNum);

        // 시작 번호
        this.startNum = (this.endNum - (pageLimit - 1));

        // 이전 유무
        this.prev = (this.startNum > 1);

        // 다음 유무
        this.next = (this.endNum < realEndNum);
    }
}
