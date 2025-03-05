package com.neosoft.ArrayToArraylist;

//Java Program to Convert Array to ArrayList.
//        Input: arr = [ 2, 3, 4, 5, 8]
//Output: ArrayList = [ 2, 3, 4, 5, 8]

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayToArrayListDemo {

    public static void main(String[] args) {
//        int[] name = {1,2,3,4,5,8};
//
//        List<Integer> al = Arrays.stream(name).boxed().collect(Collectors.toUnmodifiableList());
//        System.out.println(al);


        int [] num =  new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 5 elements  : ");

        for(int i = 0; i< num.length; i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Converting Array To ArrayList");

        List<Integer> li = Arrays.stream(num).boxed().collect(Collectors.toUnmodifiableList());
        System.out.println("ArrayList is "+li);


    }

}
