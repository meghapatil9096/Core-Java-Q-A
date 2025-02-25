package main;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Orange",10);
        map.put("Banana",20);
        map.put("Apple",13);

/*        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" -> "+m.getValue());
        }
        System.out.println("contain : "+map.containsKey("Apple"));
// return set view all data
        map.entrySet().forEach(System.out::println);
        System.out.println(map.get("Apple"));
// It returns set view of key
        map.keySet().forEach(System.out::println);
// It returns values
        map.values().forEach(System.out::println);

        System.out.println(map.containsKey("Apple"));
        System.out.println(map.reversed());
        System.out.println(map.sequencedEntrySet());
        System.out.println(map.sequencedKeySet());
        System.out.println(map.sequencedValues());


        System.out.println(map.putFirst("Papaya",45));
        System.out.println(map);
        System.out.println(map.putLast("Mango",65));
        System.out.println(map);

        System.out.println(map.isEmpty());

        System.out.println(map.clone());
        System.out.println(map.compute("Apple",(oldValue,newValue)->newValue+1));
        System.out.println(map);

        System.out.println(map.computeIfAbsent("Apple",k->10));
        System.out.println(map.hashCode());

 */
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
        System.out.println(map);

    }
}
