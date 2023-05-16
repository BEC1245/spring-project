package com.hi.deptspring.deptspring.service;

import com.hi.deptspring.deptspring.mapper.deptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptDeleteService {

    @Autowired
    private deptMapper mapper;

    public int deleteDept(int deptno){
        return mapper.deleteDept(deptno);
    }

}
