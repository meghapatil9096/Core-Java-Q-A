package main;

//Develop a Java program where Shape is an abstract class, and Rectangle and Circle are its subclasses
//with calculateArea() implemented.

import java.util.Scanner;

abstract class Shape
{
    abstract double calculateArea();
}
class Rectangle extends Shape
{
    private double length;
    private double width;
    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
class Triangle extends Shape
{
    private double radius;

    Triangle(double radius)
    {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the Rectangle :");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the Rectange :");
        double width = sc.nextDouble();
        Rectangle r= new Rectangle(length, width);
        r.calculateArea();
        System.out.println("The area of the Reactangle is :"+r.calculateArea());

        System.out.println("Enter the radius of the Triangle :");
        double radius =sc.nextDouble();
        Triangle t = new Triangle(radius);
        t.calculateArea();
        System.out.println("The area of the Triangle i :"+t.calculateArea());

    }
}
