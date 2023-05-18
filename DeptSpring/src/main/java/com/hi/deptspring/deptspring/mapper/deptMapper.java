package com.hi.deptspring.deptspring.mapper;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.domain.DeptRegistRequest;
import com.hi.deptspring.deptspring.domain.DeptSearchOption;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface deptMapper {

    // 전체 부서 리스트
    List<DeptDTO> selectAll();
    List<DeptDTO> selectAll2();

    // deptno 컬럼으로 검색 => DeptDTO
    DeptDTO selectByDeptno(int deptno);

    List<DeptDTO> selectByDeptnos(List<Integer> deptno);




    // deptRegistRequest를 받아 insert해주는 메서드
    int insertDept(DeptRegistRequest deptRegistRequest);

    int insertDept2(DeptDTO dto);

    // DeptDTO를 전달 받고 update 처리 해주는 메서드
    int updateDept(DeptDTO deptDTO);

    int deleteDept(int deptno);

    List<DeptDTO> selectByOption(DeptSearchOption searchOption);
}
