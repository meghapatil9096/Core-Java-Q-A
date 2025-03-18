package com.neosoft.Stream_API_Demo;
// find Number of Failed Students (count)
import java.util.Arrays;
import java.util.List;

public class CountDemo {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(50,85,74,30,28,10);
        long noOfFailedStudent = marks.stream().filter(s -> s<35).count();
        System.out.println("Number of Failed Students count is "+noOfFailedStudent);
    }
}
