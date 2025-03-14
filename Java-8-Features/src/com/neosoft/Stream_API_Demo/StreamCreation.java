package com.neosoft.Stream_API_Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
//        Collection
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream();

//        Array
        String str[] = {"A","B","C"};
        Arrays.stream(str);

//        Stream
        Stream<Integer> st = Stream.of(1,2,3,4);

    }
}
