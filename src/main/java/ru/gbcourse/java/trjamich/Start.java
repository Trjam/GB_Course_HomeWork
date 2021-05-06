package ru.gbcourse.java.trjamich;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Start {

    public static void start(Class c) throws InvocationTargetException, IllegalAccessException {

        Method[] methods = c.getDeclaredMethods();

        List<Method> methodList = new ArrayList<>();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                methodList.add(method);
            }

        }

        //Не осилил сам как в компаратор запихнуть приоритет, так что честно подсмотренно)
        methodList.sort(Comparator
                .comparingInt((Method i) -> i.getAnnotation(Test.class).priority())
                .reversed());

        for (Method method : methods) {
            if (methodList.size()>0) {
                if (method.isAnnotationPresent(BeforeSuite.class)) {
                    if (methodList.get(0).isAnnotationPresent(BeforeSuite.class)) {
                        throw new RuntimeException("BeforeSuite can't be more then 1");
                    }
                    methodList.add(0, method);
                }
                if (method.isAnnotationPresent(AfterSuite.class)) {
                    if (methodList.get(methodList.size() - 1).isAnnotationPresent(AfterSuite.class)) {
                        throw new RuntimeException("AfterSuite can't be more then 1");
                    }
                    methodList.add(method);
                }
            }
        }

        for (Method m : methodList) {
            m.invoke(null);
        }
    }
}
