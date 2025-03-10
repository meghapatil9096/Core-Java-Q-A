package com.neosoft.GenericsMethod;

import java.lang.reflect.Array;

public class GenericsMethodDemo {
//    static method with generics
    public static <T> void printArray(T[] array)
    {
        for (T item : array)
        {
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"A","B","C","D","E"};

        System.out.println("Integer : ");
        printArray(intArray);
        System.out.println("\nString : ");
        printArray(strArray);

    }
}
