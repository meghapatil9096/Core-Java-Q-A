package com.neosoft.FindSecondHighest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Find the second highest number present in the list
public class FindSecondHighest {

    static int findSecondLargest(List<Integer> list)
    {
        Collections.sort(list);
        return list.get(list.size()-2);
    }

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(3,8,6,9,2,1);
        System.out.println("Second Highest Number is : "+findSecondLargest(num));

    }


}
