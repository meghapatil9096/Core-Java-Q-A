package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorListDemo {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>(5,3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.capacity());
        list.add(7);
        System.out.println(list.capacity());
        list.add(8);
        list.add(9);
        System.out.println(list.capacity());

        Vector<Integer> list2 = new Vector<>(Arrays.asList(11,12,13,14,15,16));
        list.addAll(list2);
        System.out.println(list);

        list2.clear();
        System.out.println(list2);
        System.out.println(list.contains(11));
        System.out.println(list.containsAll(list2));

        Integer[] list3 = new Integer[list.size()];
//        copy all element into other array
        list.copyInto(list3);
        System.out.println(Arrays.toString(list3));

        System.out.println(list.equals(list2));
        System.out.println(list.equals(list3));

        System.out.println(list.firstElement());

        list.forEach(num -> System.out.print(num+" "));
        System.out.println();

// return hash code value of vector
        System.out.println(list.hashCode());

        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf(4));
        System.out.println(list.lastElement());
        System.out.println(list.listIterator());

        list.removeIf(num -> num < 3);
        System.out.println(list);

        System.out.println(list.set(4,4));
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.capacity());
        System.out.println(list.spliterator());
        System.out.println(list.subList(0,4));
        list.trimToSize();
        System.out.println(list);
        System.out.println(list.size());

        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        Vector<Integer> list5 = new Vector<>(list4);
        System.out.println(list5);
    }
}
