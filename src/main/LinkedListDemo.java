package main;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

    /* Linked List  */

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(5);
        list.addLast(6);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);

        list.removeIf(x -> x%2==0);
        System.out.println(list);

        LinkedList<String> animals= new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> animalToRemove = new LinkedList<>(Arrays.asList("Dog","Lion"));
        animals.remove(animalToRemove);
        System.out.println(animals);

        System.out.println(list.clone());       //Shallow copy of an list
        System.out.println(list.element());     // show first element
        System.out.println(list.offerFirst(0));
        System.out.println(list.peekLast());
        System.out.println(list.set(1,5));
        System.out.println(list.removeFirst());
        System.out.println(list.size());
        System.out.println(list);

    }
}
