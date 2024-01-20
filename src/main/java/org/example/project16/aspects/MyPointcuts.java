package org.example.project16.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* org.example.project16.UniversityLibrary.add*(..))")
    public void allAddMethods() {}
}
