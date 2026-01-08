package collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //1. declaration
    List<String> fruits = new ArrayList<>(); 
    List<Integer> list = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    // 2. add element
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Apple"); // Duplicate are allowed
    System.out.println("List : "+fruits);
    

    }
    
}
