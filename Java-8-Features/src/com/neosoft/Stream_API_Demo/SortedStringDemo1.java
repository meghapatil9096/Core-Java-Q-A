package com.neosoft.Stream_API_Demo;

import java.util.Arrays;
import java.util.List;

public class SortedStringDemo1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sunny","Kajal","Anushka","Divya");
        List<String> sortedList = list.stream().sorted().toList();
        System.out.println(sortedList);
    }
}
