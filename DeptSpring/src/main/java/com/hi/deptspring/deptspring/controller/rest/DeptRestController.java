package com.hi.deptspring.deptspring.controller.rest;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.domain.DeptRegistRequest;
import com.hi.deptspring.deptspring.service.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController // view를 못감
@RequestMapping("/api/v1/depts")
public class DeptRestController {

    // get : 전체 리스트
    // get/{no} : deptno로 부서 하나의 정보 받기
    // post : json 형식의 데이터를 받아서 데이처를 저장
    // put/{no} : deptno로 하나의 부서를 수정, 전체 데이처를 수정
    // delete/no : deptno로 부서 하나를 삭제

    @Autowired // 명시용
    private DeptListService listService;

    @Autowired
    private DeptReadService readService;

    @Autowired
    private DeptRegistService registService;

    @Autowired
    private DeptModifyService modifyService;

    @Autowired
    private DeptDeleteService deptDeleteService;

    @GetMapping // /api/v1/depts
    public ResponseEntity<List<DeptDTO>> getDeptList(){

        // ResponseEntity<T>는 응답 해야하는 데이터를 제네릭으로 정의하는 타입
        // T안에는 body(응답 데이터 [데이터 타입을 맞처줘야 한다]), httpHeader(해더 값), statusCode(상태 코드[404, 200 등등])을 넣을 수 있고
        // header의 정의는 HttpHeaders형식으로 map 형식으로 정의된 header 값을 전달 할 수 있다.
        HttpHeaders httpHeaders = new HttpHeaders(); // 해더의 값을 넣을 httpheaders를 선언하는 부분
        httpHeaders.set("some-header", "some-value"); // 해더의 값을 정의하는 부분 (key, value 모두 공백이 없는 문자열이여야 한다)

        // 제네릭 타입인 ResponseEntity가 설정되는 부분 (보낼 값, header값, 상태 값);
        ResponseEntity<List<DeptDTO>> entity = new ResponseEntity<>(listService.getList(), httpHeaders, HttpStatus.NOT_FOUND);

        // 결과를 json 형식으로 반환
        // ResponseEntity 형식으로 return 하기에 ResponseEntity형식으로 리턴타입을 설정 해야함
        return entity;
    }

    @GetMapping("/{no}") // /api/v1/depts/{no} -> 예시 ) /api/v1/depts/62

    // 당연히 리턴 타입에는 body값을 명시해줘야 한다.
    public ResponseEntity<DeptDTO> getDept(
            // GetMapping의 "no"값을 받는 어노테이션
            @PathVariable("no") int variable
    ){
        return new ResponseEntity<>(readService.getDept(variable), HttpStatus.OK);
    }

    @PostMapping // /api/v1/depts
    public ResponseEntity<String> post(
            @RequestBody DeptRegistRequest dto
    ){
        int result = registService.registDept(dto);

        return new ResponseEntity<>(result==1 ? "alived" : "died", HttpStatus.OK);
    }

    // put/{no} : deptno로 하나의 부서를 수정, 전체 데이처를 수정
    @PutMapping("/{no}")
    public String Put(
            @PathVariable("no") int deptno,
            @RequestBody DeptDTO dto
    ){
        Integer result = 0;
        if(readService.getDept(deptno) != null){
            dto.setDeptno(deptno);
            result = modifyService.modifyDept(dto);
        }

        return (result == 1) ? "yes" : "no";
    }

    // delete/{no} : deptno로 부서 하나를 삭제
    @DeleteMapping("/{no}")
    public String delete(
            @PathVariable("no") int cursor
    ){

        int result = 0;
        if(readService.getDept(cursor) != null){
            result = deptDeleteService.deleteDept(cursor);
        }

        String sendMessage = (result==1) ? "deleted" : "not deleted";

        return sendMessage;
    }

}




















