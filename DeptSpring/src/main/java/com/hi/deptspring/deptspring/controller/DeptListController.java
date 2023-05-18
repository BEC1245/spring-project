package com.hi.deptspring.deptspring.controller;

import com.hi.deptspring.deptspring.domain.DeptSearchOption;
import com.hi.deptspring.deptspring.service.DeptListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
public class DeptListController {

    // autowired의 문제 -> runtime시에 오류를 던질 수 있음
    // 그래서 final 통해서 상수화 하고 생성자를 만들는 처리를 할 수 있다
    // 이 생성자 안에는 spring이 해당 객체를 자동 주입을 해줘서 뭘 넣을 필요가 없다
    private final DeptListService service;

    public DeptListController(DeptListService service) {
        this.service = service;
    }

    @RequestMapping("/dept/list")
    public void getListPage(
            // 처음 실행시 받는 값은 null이기에 400에러를 던짐
            // 그렇다고 requierd = false를 하면 nullpointer 오류가 난다 왜 trim에서 값을 읽는 데 그 값이 없어서
            @RequestParam(value = "searchType", defaultValue = "") String searchType,
            @RequestParam(value = "keyword", defaultValue = "") String keyword,
            DeptSearchOption deptSearchOption,
            Model model
    ){
        // 당연히 들어온 값이 어무것도 없음에 대한 문제를 처리해야함
        Boolean check = (deptSearchOption.getKeyword() != null && deptSearchOption.getKeyword().trim().length() > 0);
        deptSearchOption.setKeyword(check ? deptSearchOption.getKeyword() : null);
        deptSearchOption.setSearchType(check ? deptSearchOption.getSearchType() : null);

        // 여기서 빌더에 searchType메서드로는 searchType 값을 넝는 것 이고 이는 3항 연산자의 사용이 가능하다
        DeptSearchOption searchOption = DeptSearchOption
                .builder()
                .searchType(keyword.trim().length() < 1 ? null : searchType)
                .keyword(keyword.trim().length() < 1 ? null : keyword)
                .build();

        log.info(">>>>>> searchOption" + searchOption);
        log.info(">>>>>>>>>>> deptSearchOption" + deptSearchOption);

        model.addAttribute("list", service.getSearchList(deptSearchOption));
    }

}
