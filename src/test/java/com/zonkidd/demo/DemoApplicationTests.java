package com.zonkidd.demo;

import com.zonkidd.demo.aop.CustomAdvisor;
import com.zonkidd.demo.aop.CustomInterceptor;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    void testAutoProxyAop(){
        testService.test ();
    }

}
