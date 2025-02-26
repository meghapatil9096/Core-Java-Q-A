package main;

import java.util.ArrayList;

public class GernericDemo {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("Ashok");
//        list.add(123);  //they have no restriction to asign any type of value is not good
//        list.add(12.2); // 1)No type safety
//
//        String str = (String) list.get(0);  // 2)manual casting
//        System.out.println(str);
//        String str2 = (String) list.get(1); // 3) no complier time check
//        System.out.println(str2);   //Giving Exception in thread main




//        These issues can be solved by Generics
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hardik");
        list2.add("Pushpa");
//        list2.add(123);     // this not allow to write other data
        String str3 = (String) list2.get(0);
        System.out.println(str3);
    }
}
