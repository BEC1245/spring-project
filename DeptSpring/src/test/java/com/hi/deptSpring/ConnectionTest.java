package com.hi.deptSpring;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.mapper.TimeMapper;
import com.hi.deptspring.deptspring.mapper.TimeMapper2;
import com.hi.deptspring.deptspring.mapper.deptMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Log4j2

@ExtendWith(SpringExtension.class) // 자동으로 주입을 해주는 넘
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml") // 설정을 수동으로 주입해주는 어노테이션
public class ConnectionTest {

    // 데이터 소스를 주입받고 싶은거임
    @Autowired
    private DataSource dataSource;

    // 자동 주입
    @Autowired(required = false)
    private TimeMapper timeMapper;

    @Autowired(required = false)
    private TimeMapper2 timeMapper2;

    @Autowired(required = false)
    private deptMapper mapper;

    @Test
    public void getTimeMapperTest(){

        log.info(mapper.selectByDeptno(10));
        log.info(mapper.selectByDeptno(20));
        log.info(mapper.selectByDeptno(30));
        log.info(mapper.selectByDeptno(40));
    }


    @Test
    public void connectionTest() throws SQLException {
        Connection connection = dataSource.getConnection();

        log.info("connection : " + connection);

        // 태스트한 결과를 보여준다
        // 아래의 메서드는 해당 객체가 null이 아니면 맟다고 알려줄 것이다.
        Assertions.assertNotNull(connection); // null이면 실패 아니면 성공

        connection.close();
    }

}
