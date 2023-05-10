package com.example.demoman;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2 // 로그 찍어주는 넘
@ExtendWith(SpringExtension.class) // 스프링에 선언한 메서드를 생성해주는 넘
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml") // 설정 파일을 읽는 넘
public class SampleTest {

    @Autowired // 있는 객체를 생성
    private SampleService sampleService;

    @Test // Test 라고 선언을 해야 사용이 가능
    public void testService() {
        log.info("SampleTest...testService()...");
        sampleService.printTest();
    }

    // test는 main이 필요없다.

}
