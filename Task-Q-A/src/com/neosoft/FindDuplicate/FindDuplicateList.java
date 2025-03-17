package com.neosoft.FindDuplicate;
//Given a list of integers find the duplicates present in the list
import java.util.*;

public class FindDuplicateList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,5,1,3,2,3,1,2,1);
/*
        Set<Integer> set = new HashSet<>();
        Set<Integer> empt = new HashSet<>();
        for (int i=0; i<list.size(); i++)
        {
            if(!set.add(list.get(i)))
            {
                empt.add(list.get(i));
            }
        }

        System.out.println(empt);*/

        Map<Integer, Integer> map = new HashMap<>();

        list.forEach(item -> {
            if (map.containsKey(item)) {
                var value = map.get(item);
                map.put(item, ++value);
            }
            else {
                map.put(item, 1);
            }
        });
        System.out.println(map);
        map.forEach((key, value) -> {
            if(value > 1){
                System.out.println(key);
            }
        });

    }
}
