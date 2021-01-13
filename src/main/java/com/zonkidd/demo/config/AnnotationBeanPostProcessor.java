package com.zonkidd.demo.config;

import com.zonkidd.demo.aop.CustomAdvisor;
import com.zonkidd.demo.aop.CustomInterceptor;
import org.springframework.aop.framework.autoproxy.AbstractBeanFactoryAwareAdvisingPostProcessor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Component;

/**
 * 将这个注册到容器中可以是customAdvisor生效
 * @author zjj
 * @create 2021-01-11
 */
@Component
public class AnnotationBeanPostProcessor extends AbstractBeanFactoryAwareAdvisingPostProcessor {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        super.setBeanFactory(beanFactory);
        CustomAdvisor advisor = new CustomAdvisor(new CustomInterceptor () );
        this.advisor = advisor;
    }
}