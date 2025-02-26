package main;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(12,"komalll");
        ht.put(22,"Rahul");
        ht.put(32,"Pooja");
        ht.put(14,"monali");

  /*      System.out.println(ht);
        System.out.println(ht.get(12));
        System.out.println(ht.size());
        System.out.println(ht.keySet());
        System.out.println(ht.values());
        System.out.println(ht.entrySet());


        System.out.println(ht.elements());
        System.out.println(ht.containsKey(2));
        System.out.println(ht.remove(2));
        System.out.println(ht.remove(12));
        System.out.println(ht);


        System.out.println(ht);
        if(ht.containsKey(12)){
            System.out.println("value of 12 is " +ht.get(12));
        }
        else{
            System.out.println("value of 12 is null");
        }


   */

        ht.putIfAbsent(21,"punam");
        System.out.println(ht);


    }
}
