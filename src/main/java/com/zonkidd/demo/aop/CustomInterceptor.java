package com.zonkidd.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 自定义Interceptor
 *
 * @author zjj
 * @create 2021-01-10
 */
@Slf4j
public class CustomInterceptor implements MethodInterceptor {



    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("customInterceptor invoke");
        return invocation.proceed ();
    }

}
