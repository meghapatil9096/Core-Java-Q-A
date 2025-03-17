package com.neosoft.FindSecondHighest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Find the second highest number present in the list
public class FindSecondHighest3 {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(3,8,6,9,2,1);
        List<Integer> descendingSort = num.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println("Descending Order : "+descendingSort);
        System.out.println("Second Highest : "+descendingSort.get(1));
    }


}
