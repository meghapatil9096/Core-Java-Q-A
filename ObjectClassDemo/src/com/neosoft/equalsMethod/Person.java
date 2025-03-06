package com.neosoft.equalsMethod;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
//        check obj is instances of Person
        if(obj instanceof Person)
        {
            Person other = (Person) obj;    //type casting
            return this.name.equals(other.name) && this.age == other.age;
        }
        return false;
    }
}
