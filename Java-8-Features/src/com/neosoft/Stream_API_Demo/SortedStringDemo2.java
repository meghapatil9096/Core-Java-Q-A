package com.neosoft.Stream_API_Demo;
// sort String according to increasing order
import java.util.Arrays;
import java.util.List;

public class SortedStringDemo2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sunny kapoor","Kajal khanna","Anushka patil","Divya sharma");
        List<String> sortedList = list.stream().sorted().toList();
        System.out.println(sortedList);
    }
}
