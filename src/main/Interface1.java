package main;

import java.util.Scanner;

interface  client
{
    void input();   //public+abstract method
    void output();
}
public class Interface1 implements client{

    String name;
    double salary;

    public void input()
    {
        System.out.println("Enter the name of the client " );
        Scanner sc =new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Enter the salary of the client ");
        salary = sc.nextDouble();
    }
    public void output()
    {
        System.out.println(name+" "+salary);
    }
    public static void main(String[] args)
    {
        client c = new Interface1();

        c.input();
        c.output();
    }
}
