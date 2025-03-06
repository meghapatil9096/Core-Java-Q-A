package com.neosoft.ArrayToLinkedlist;
//Java Program to Convert Array to LinkedList in Java.
//        Input: Array : {1,2,3,4}
//Output: LinkedList : {1,2,3,4}


import java.util.LinkedList;
import java.util.Scanner;

public class ArrayToLinkedlist {
    public static void main(String[] args) {
//        int a[] = {1,2,3,4,5};

        int[] a = new int[5];
        System.out.println("Enter 5 elements : ");
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }

        LinkedList<Integer> list = new LinkedList<>();
        for(int i : a)
        {
            list.add(i);
        }
        System.out.println("Converting Array to LinkedList is "+list);
    }
}
