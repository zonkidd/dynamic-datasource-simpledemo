package com.zonkidd.demo;

import com.zonkidd.demo.annotation.AspectAnnotation;
import com.zonkidd.demo.aop.CustomAdvisor;
import com.zonkidd.demo.aop.CustomInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.DynamicIntroductionAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultIntroductionAdvisor;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zjj
 * @create 2021-01-10
 */
@Slf4j
@Component
public class TestServiceImpl implements TestService{

    @Resource
    private ApplicationContext context;

    @AspectAnnotation( "" )
    public void test(){
        context.getBean ( CustomAdvisor.class );
        log.info("testServiceImpl invoke");
    }


}
