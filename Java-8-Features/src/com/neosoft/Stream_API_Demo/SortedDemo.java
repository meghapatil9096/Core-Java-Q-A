package com.neosoft.Stream_API_Demo;
// Sorted list
import java.util.Arrays;
import java.util.List;

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(50,85,74,30,28,10);

//  sorted()  ==> According to default natural sorting order
        List<Integer> sortedList = marks.stream().sorted().toList();
        System.out.println("Sorted List : "+sortedList);
    }
}
