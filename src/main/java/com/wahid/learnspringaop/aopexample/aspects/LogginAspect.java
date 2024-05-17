package com.wahid.learnspringaop.aopexample.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// Configuration
// AOP
@Configuration
@Aspect
public class LogginAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    //Pointcut - when to do?

    // execution(* PACKAGE.*.*(..)) //intercept all the method calls that are happening in classes withing this package
    // execution(* com.wahid.learnspringaop.aopexample.business.*.*(..)) // intercept execution of all bean in this package
    @Pointcut("")
    public void logMethodCall(){
        // we are going to intercept all the method calls that are going to the business and data layer beans

        //Logic: what to do?
        logger.info("Method is called - ");

    }
}
