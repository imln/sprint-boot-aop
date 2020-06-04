package com.spring_boot.aop_example.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentServiceAspect {
    @Before(value = "execution(* com.spring_boot.aop_example.service.StudentService.*(..)) && args(stdId, firstName, lastName)")
    public void beforeAdvice(JoinPoint joinPoint, String stdId, String firstName, String lastName) {
        System.out.println("Before method:" + joinPoint.getSignature());
        System.out  .println("Creating Employee with first name - " + firstName + ", second name - " + lastName + " and id - " + stdId);
    }
}
