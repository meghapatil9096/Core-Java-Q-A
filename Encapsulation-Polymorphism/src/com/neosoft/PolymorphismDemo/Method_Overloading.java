package com.neosoft.PolymorphismDemo;

public class Method_Overloading {

    public  void add(int a,int b)
    {
        int sum = a+b;
        System.out.println("sum is "+sum);
    }
    public  void add(int a, double b)
    {
        double sum = a+b;
        System.out.println("sum is "+sum);
    }
    public  void add(double a, int b)
    {
        double sum = a+b;
        System.out.println("sum is "+sum);
    }
    public  void add(int a, double b, float c)
    {
        double sum = a+b;
        System.out.println("sum is "+sum);
    }
    public  int add(int  a, int b, int c)
    {
        int sum1 = a+b+c;
        return sum1;
    }
    public static void main(String[] args) {
        Method_Overloading m = new Method_Overloading();
        m.add(2,6);
        m.add(4,8);
        m.add(44,32);
        m.add(3,55.4,3);
//        m.add(4,5,6);
        System.out.println(m.add(4,5,6));
    }

}
