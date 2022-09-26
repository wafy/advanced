package hello.advanced.trace.template;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateMethodTest {

    @Test
    void templateMethodV0() {
        logic1();
        login2();

    }

    private void logic1() {
        long startTime = System.currentTimeMillis();
        //비즈니스 로직 실행
        log.info("비지니스 로직1 실행");
        //비즈니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTimme = endTime - startTime;
        System.out.println("resultTimme = " + resultTimme);
    }

    private void login2() {
        long startTime = System.currentTimeMillis();
        //비즈니스 로직 실행
        log.info("비지니스 로직1 실행");
        //비즈니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTimme = endTime - startTime;
        System.out.println("resultTimme = " + resultTimme);
    }

}
