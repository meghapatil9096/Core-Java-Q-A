package com.neosoft.Stream_API_Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,3,4,5);

//        Stream Pipeline
        List<Integer> evenNum = num.stream()    //creating stream
                .filter(n -> n%2==0)    // Intermediate Opertion
                .map(n -> n*2)          //Intermediate Oper
                .collect(Collectors.toList());  //Terminal Operation

        System.out.println("Even Number is : "+evenNum);
    }
}
