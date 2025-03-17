package com.neosoft.Stream_API_Demo;
// Sorted list
import java.util.Arrays;
import java.util.List;

public class Stream_SortedDemo1 {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(50,85,74,30,28,10);
        List<Integer> sortedList = marks.stream().sorted().toList();
        System.out.println("Sorted List : "+sortedList);

        /*  (i1,i2) -> i1<i2 ? 1: i1>i2? -1: 0
        Comparator --> compare(obj1, obj2)
            return -ve iff obj1 has to come before obj2
            return +ve iff obj1 has to come after obj2
            return 0 iff obj1 and obj2 are equal
         */
        List<Integer> descsortedList = marks.stream().sorted((i1,i2)-> i2.compareTo(i1)).toList();
        System.out.println(" Descending Sorted List : "+descsortedList);
        System.out.println("Second highest score is "+descsortedList.get(1));
    }
}
