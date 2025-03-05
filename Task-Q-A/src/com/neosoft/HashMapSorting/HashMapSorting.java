package com.neosoft.HashMapSorting;
//How to Iterate HashMap in Java?
//Input: { "A" = "Angular" , "P": "Python" , "J" = "Java" , "H" = "Hibernate" }
//Output: P = Python
//        A = Angular
//        H = Hibernate
//        J = Java


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSorting {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("P","Python");
        map.put("A","Angular");
        map.put("H","Hibernate");
        map.put("J","Java");

      for(Map.Entry<String, String> entry : map.entrySet())
      {
          System.out.println(entry.getKey()+" = "+entry.getValue());
      }

    }
}
