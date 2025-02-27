package Inheritance;

//     Multilevel Inheritances
 class Add1  //super class
 {
     int a,b,c;
     void add()
     {
         a=10;   b=20;
         c=a+b;
         System.out.println("Addition of to number : "+c);
     }
     void sub()
     {
         a=200;   b=20;
         c=a-b;
         System.out.println("Sub of to number : "+c);
     }
 }
 class B1 extends Add1  //sub1
 {
     void multi()
     {
         a=10;   b=20;
         c=a*b;
         System.out.println("Multiplication of to number : "+c);
     }
     void div()
     {
         a=20;   b=20;
         c=a/b;
         System.out.println("Division of to number : "+c);
     }

 }

 class C1 extends B1  //sub2
 {
     void rem()
     {
         a=152;   b=5;
         c=a%b;
         System.out.println("Remaining number : "+c);
     }
 }
 class MultilevelInheritance extends C1
 {
     public static void main(String[] args) {
         MultilevelInheritance obj = new MultilevelInheritance();
         obj.add();
         obj.sub();
         obj.div();
         obj.rem();
     }
 }

