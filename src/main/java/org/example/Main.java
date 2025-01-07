package org.example;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Method[] methods = AnnotationProcessor.class.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(SomeAnnotation.class)) {
                SomeAnnotation annotation = method.getAnnotation(SomeAnnotation.class);
                System.out.println("Метод: " + method.getName());
                System.out.println("Значення 1: " + annotation.value1());
                System.out.println("Значення 2: " + annotation.value2());
                System.out.println();

            }
        }
        System.out.println("Hello, World!");
    }
}