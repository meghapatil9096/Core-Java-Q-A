package com.neosoft.HashCodeMethod;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age =age;
    }
// Override HashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(name,age);      //Generates a hash based on name age
    }
}
