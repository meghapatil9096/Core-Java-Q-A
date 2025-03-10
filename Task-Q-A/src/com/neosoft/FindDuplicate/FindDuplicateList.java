package com.neosoft.FindDuplicate;
//Given a list of integers find the duplicates present in the list
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(2);

        Set<Integer> set = new HashSet<>();

        for (int i =0; i<list.size(); i++)
        {
            for (int j = i+1; j<list.size(); j++)
            {
                if(list.get(i) == list.get(j))
                {
                    set.add(list.get(i));
//                    System.out.println(list.get(i)+" ");
                }
            }
        }
        System.out.println(set+" ");

    }
}
