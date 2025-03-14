package com.neosoft.Stream_API_Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Find Maximum number from list with stream
public class Stream_MaxValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,22,13,34,5);

        Optional<Integer> MaxValue = list.stream()
                /*.reduce(Integer.MIN_VALUE,  (a,b) -> a>b ? a:b);*/
                        .max((a,b)-> {
                            if(a-b > 0) {
                                return 1;
                            }
                            if( a - b < 0) {
                                return -1;
                            }
                             return 0;
                        });
        System.out.println("Max value fro List is "+MaxValue);


    }
}
