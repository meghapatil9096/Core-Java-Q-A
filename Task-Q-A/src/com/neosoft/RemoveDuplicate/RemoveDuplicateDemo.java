package com.neosoft.RemoveDuplicate;

import java.util.*;

//How do you remove duplicate elements from an ArrayList?
public class RemoveDuplicateDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,2,2,4,5);
        System.out.println("Give List : "+list);
        Set<Integer> set = new HashSet<>(list);

        list = new ArrayList<>(set);
        System.out.println("Remove Duplicate value from list : "+list);
    }
}
