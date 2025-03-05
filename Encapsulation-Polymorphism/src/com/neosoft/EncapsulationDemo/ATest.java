package com.neosoft.EncapsulationDemo;

public class ATest extends A {

    public static void main(String[] args) {

        ATest a = new ATest();
        a.setAge(-23);

        if(a.age>0)
        {
            System.out.println("Age  >> "+a.getAge());
        }
        else
        {
           System.out.println("Invalid age");
        }
    }
}
