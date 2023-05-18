package com.hi.deptspring.deptspring.controller.rest;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController // 각각의 메서드에 @responsbody를 적용시킴
@RequestMapping("/test")
public class ExampleRestController {

    // 메소드의 반환 타입이 String이면 -> 문자열 이다
    @GetMapping("/sample1")
    public String hello(){
        return "/mc/simple";
    }

    // 객체로 리턴을 할 경우 json 형식으로 반환해줌
    // 이 작업은 jackson-databind가 자동적으로 해준다
    // 이 요청을 클라가 했을 경우 해당 정보를 json 형식으로 전달하는 형식
    @GetMapping("/sample2")
    public DeptDTO getDept(){
        DeptDTO dto = DeptDTO.builder()
                .deptno(90)
                .dname("할아버지...")
                .loc("인천이야...")
                .build();

        return dto;
    }


    // 객체를 담는 리스트의 형식일 경우
    // [안에] json형식의 데이터를 ","이걸로 불리시켜 넣어서 작동 시킨다
    // 아래의 코드는 이렇게 반환된다
    // [{"deptno":10,"dname":"testing","loc":"location"}, {"deptno":10,"dname":"testing","loc":"location"}....]
    @GetMapping("/sample3")
    public List<DeptDTO> getDeptList(){
        List<DeptDTO> list = new ArrayList<>();
        list.add(new DeptDTO(10, "testing", "location"));
        list.add(new DeptDTO(10, "testing", "location"));
        list.add(new DeptDTO(10, "testing", "location"));

        return list;

    }


    // map 형식은 {"1":{"deptno":10,"dname":"testing","loc":"location"}} 와 같이
    // 예기에 키 값이 : 여기에 value형식으로 들어감
    @GetMapping("/sample4")
    public Map<Integer, DeptDTO> getDeptMap(){
        Map<Integer, DeptDTO> map = new HashMap<>();
        map.put(1, new DeptDTO(10, "testing", "location"));
        map.put(2, new DeptDTO(10, "testing", "location"));
        map.put(3, new DeptDTO(10, "testing", "location"));
        return map;

    }

}
