package com.neosoft.ArrayToArraylist;

//Java Program to Convert Array to ArrayList.
//        Input: arr = [ 2, 3, 4, 5, 8]
//Output: ArrayList = [ 2, 3, 4, 5, 8]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ArrayToArrayListDemo {

    public static void main(String[] args) {

        int [] num =  new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 5 elements  : ");

        for(int i = 0; i< num.length; i++)
        {
            num[i]=sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>(num[4]);

        for (int i : num)
        {
            list.add(i);
        }

        System.out.println(" Converting Array to ArrayList  "+list);

    }

}
