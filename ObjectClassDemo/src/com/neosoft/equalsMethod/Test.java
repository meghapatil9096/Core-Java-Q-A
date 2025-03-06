package com.neosoft.equalsMethod;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 23);
        Person p2 = new Person("Alice", 23);
        Person p3 = new Person("Abhi", 25);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));


    }
}
