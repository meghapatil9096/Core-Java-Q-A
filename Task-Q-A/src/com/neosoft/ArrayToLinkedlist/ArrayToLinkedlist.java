package com.neosoft.ArrayToLinkedlist;
//Java Program to Convert Array to LinkedList in Java.
//        Input: Array : {1,2,3,4}
//Output: LinkedList : {1,2,3,4}

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayToLinkedlist {
    public static void main(String[] args) {
//        int a[] = {1,2,3,4,5};

        int a[] = new int[5];
        System.out.println("Enter 5 elements : ");
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }


        List<Integer> li = Arrays.stream(a).boxed().collect(Collectors.toUnmodifiableList());
        LinkedList<Integer> list = new LinkedList<>(li);
        System.out.println("LinkedList is "+list);
    }
}
