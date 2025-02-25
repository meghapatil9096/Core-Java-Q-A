package main;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(106,"Abhijeet");
        map.put(103,"kaveri");
        map.put(107,"Alex");
        map.put(102,"komal");
        map.put(108,"rahul");
        map.put(101,"romi");

 /*       System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map);
//if 104 is not present then it will return next number of 104
        System.out.println(map.ceilingKey(104));

//        it show in descending order
        System.out.println(map.descendingKeySet());
//        it show in ascending order
        System.out.println(map.keySet());
        System.out.println(map.ceilingEntry(103));
        System.out.println(map.floorEntry(102));
        System.out.println(map.firstEntry());


        System.out.println(map.higherEntry(1));
        System.out.println(map.containsKey(101));
        System.out.println(map.get(101));

        System.out.println(map);
        System.out.println(map.pollLastEntry());
        System.out.println(map);

  */
        map.remove(101);
        System.out.println(map);
        map.replace(102,"komalll");
        System.out.println(map);
        System.out.println(map.subMap(101,105));


    }
}
