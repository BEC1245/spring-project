package com.hi.deptspring.deptspring.service;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.mapper.deptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptModifyService {

    @Autowired
    private deptMapper mapper;

    public int modifyDept(DeptDTO deptDTO){
        return mapper.updateDept(deptDTO);
    }

}
