package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> list = new Stack<String>();
         list.push("Apple");
         list.push("Banana");
         list.push("Chiku");
         System.out.println(list);
         System.out.println(list.pop());
         System.out.println(list);
         System.out.println(list.peek());
         System.out.println(list);
         System.out.println(list.isEmpty());
         System.out.println(list.size());

//         for searching
         int search = list.search("Banana");
          System.out.println(search);


//      Linked List as stack
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.getLast();    //peek
        list1.removeLast(); //pop
        list1.size();
        list1.isEmpty();
        System.out.println(list1);


//        Array List As Stack but it is not good practices
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.get(list2.size()-1);  //peak
        list2.remove(list2.size()-1);   //pop



    }
}
