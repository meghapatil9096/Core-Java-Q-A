package main;

import java.util.*;

class StringLengthComparator implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
class MyComparator implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;

    }
}
public class CListDemo {
    public static void main(String[] args) {
/*       ArrayList   */



/*        ArrayList<Integer> list =new ArrayList<>(11);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
    System.out.println(list.size());

        list.add(23);
        list.add(45);
        list.add(65);
        System.out.println(list.get(0));
        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        for(int x :list)
        {
            System.out.println(x);
        }
        System.out.println(list.contains(23));
        System.out.println(list.contains(40));


        list.remove(2);
        list.add(1,30);
        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        list.set(1, 77);
        System.out.println(list);

         List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("sun", "mon", "tue");
        System.out.println(list1.getClass().getName());
//        list1.add("fri");  //you cannot add or remove from this list of Arrays.
        list1.set(2,"wed");     // you can only replace the value
        System.out.println(list1);

        String[] array ={"sun", "mon", "tue"};
        List<String> list2= Arrays.asList(array);
        System.out.println(list2.getClass().getName());
        System.out.println(list2);
        System.out.println(list2.get(2));

        List<Integer> list3 = List.of(1, 23, 3);
//        list3.set(4);   // you cannot set any value in List.of()
        System.out.println(list3);

        List<Integer> list4 = new ArrayList<>(list3);
        list4.add(11);      // we can add in this way
        System.out.println(list4);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> list2 = List.of(4, 5, 6);
        list.addAll(list2);
        list.addFirst(8);
        System.out.println(list);

        //converting to Array
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Object[] array = list.toArray();
        Integer[] array1 = list.toArray(new Integer[0]);

// sorting an array
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        list.sort(new MyComparator());  //call MyComparator class
        System.out.println(list);

        List<String> words = Arrays.asList("banana","Apple","orange");
        words.sort(new StringLengthComparator());
        System.out.println(words);

 */

        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.addLast(5);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }
}
