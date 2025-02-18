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



//        Wrapper class
        int i=1;    //this value save in stack memory
        Integer j=1; //this value save in heap memory
        Integer v = 3;  //Autoboxing    primitive into wrapper class
        int k =v.intValue();    //Unboxing  - wrapper class into primitve data type

//      Methods
        System.out.println(Integer.max(3,5));
        System.out.println(Integer.toBinaryString(11));
        System.out.println(Integer.min(3,5));
        String str = "123";
        Integer m =Integer.valueOf(str);
        System.out.println(m);
        Integer x=1;
        Integer y =2;
        System.out.println(x.equals(y));

    }
}
