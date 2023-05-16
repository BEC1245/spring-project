package com.hi.deptspring.deptspring.service;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.mapper.deptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// service 라는 것을 명시
@Service
public class DeptListService {

    @Autowired
    private deptMapper mapper;

    public List<DeptDTO> getList(){
        return mapper.selectAll();
    }

}
