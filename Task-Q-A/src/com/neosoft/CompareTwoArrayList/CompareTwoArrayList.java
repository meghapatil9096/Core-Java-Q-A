package com.neosoft.CompareTwoArrayList;
//Comparing two ArrayList In Java
//        Input : ArrayList1 = [1, 2, 3, 4],
//        ArrayList2 = [4, 2, 3, 1]
//        Output: Array List are not equal
import java.util.ArrayList;

public class CompareTwoArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("1st Array List :"+list);
        System.out.println("2st Array List :"+list1);

        if(list.equals(list1)==true)
        {
            System.out.println("Array List are equal");
        }
        else
        {
            System.out.println("Array List are not equal");
        }

        System.out.println();

        list.add(6);
        System.out.println("1st Array List :"+list);
        System.out.println("2st Array List :"+list1);

        if(list.equals(list1)==true)
        {
            System.out.println("Array List are equal");
        }
        else
        {
            System.out.println("Array List are not equal");
        }

    }
}
