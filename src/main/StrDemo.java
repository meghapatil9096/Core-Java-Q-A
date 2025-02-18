package main;

public class StrDemo {
    public static void main(String[] args) {
        String a = "Ankit";
        System.out.println(a);
        String b = "Ankit";
        System.out.println(b);

        // String is immutable in java
        a.concat("Kumar");
        System.out.println(a);

//        if we want to change then we can have one way
        a=a.concat("Kumar"); // this is create new object a
        System.out.println(a);
    }
}
