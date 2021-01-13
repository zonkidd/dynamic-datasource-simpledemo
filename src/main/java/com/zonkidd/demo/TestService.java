package com.zonkidd.demo;

import com.zonkidd.demo.annotation.AspectAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author zjj
 * @create 2021-01-10
 */
@Component
@AspectAnnotation ( "testService" )
public interface TestService {

    @AspectAnnotation ( "" )
    void test();

}
