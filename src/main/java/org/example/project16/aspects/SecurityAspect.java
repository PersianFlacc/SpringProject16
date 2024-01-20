package org.example.project16.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.weaver.ast.Or;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class SecurityAspect {

    @Before("org.example.project16.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeAddSecurityAdvice: проверка прав на получение" +
                " книги/журнала");
        System.out.println("-------------------");
    }
}
