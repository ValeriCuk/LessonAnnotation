package org.example;

public class AnnotationProcessor {

    @SomeAnnotation(value1 = "2", value2 = "3")
    public void printValues1(String v1, String v2) {
        System.out.println(v1 + " " + v2);
    }

    @SomeAnnotation(value2 = "Value2")
    public void printValues2(String v1, String v2) {
        System.out.println(v1 + " " + v2);
    }
}
