package com.neosoft.toStringMethod;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{Name'"+name+"',Age ="+age+"}";
    }

}
