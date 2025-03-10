package com.neosoft.GenericsMethod;

import java.util.Date;

public class Demo1 {
//    generics method
    public <T> void printData(T[] arr)
    {
        for (T item :  arr)
        {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        Integer[] intd={1,2,3,4,5};
        String[] str = {"A","B","C","D","E"};

        Demo1 d = new Demo1();
        System.out.println("Integer : ");
        d.printData(intd);
        System.out.println("\nString : ");
        d.printData(str);

    }
}
