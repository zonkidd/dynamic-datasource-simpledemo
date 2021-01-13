package com.zonkidd.demo.config;

import com.zonkidd.demo.annotation.AspectAnnotation;
import com.zonkidd.demo.aop.CustomAdvisor;
import com.zonkidd.demo.aop.CustomInterceptor;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Role;

/**
 * @author zjj
 * @create 2021-01-10
 */
@Configuration
public class AopConfig {

    @Role(value = BeanDefinition.ROLE_INFRASTRUCTURE)
    @Bean
    @ConditionalOnMissingBean
    public CustomAdvisor customAdvisor(){
        CustomInterceptor customInterceptor = new CustomInterceptor ( );
        CustomAdvisor customAdvisor = new CustomAdvisor ( customInterceptor );
        customAdvisor.setOrder ( -100 );
        return customAdvisor;
    }



}
