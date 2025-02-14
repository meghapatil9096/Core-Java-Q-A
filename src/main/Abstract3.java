package main;
//Write an abstract class Employee with abstract methods calculateSalary() and getDetails(). Implement
//it in subclasses like Manager and Developer.

import java.util.Scanner;

import java.util.Scanner;

abstract class Employee {
    abstract double calculateSalary();
    abstract void getDetails();
}

class Manager extends Employee {
    private String managerName;
    private double salary;
    private double bonus;

    Manager(double salary, double bonus, String managerName) {
        this.salary = salary;
        this.bonus = bonus;
        this.managerName = managerName;
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }

    @Override
    void getDetails() {
        System.out.println("Manager Name: " + managerName);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
}

class Developer extends Employee {
    private String developerName;
    private double salary;
    private double bonus;

    Developer(String developerName, double salary, double bonus) {
        this.developerName = developerName;
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    void getDetails() {
        System.out.println("Developer Name: " + developerName);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }
}

public class Abstract3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Manager
        System.out.println("Enter the name of the Manager:");
        String name = sc.nextLine();
        System.out.println("Enter the salary of the Manager:");
        double salary = sc.nextDouble();
        System.out.println("Enter the bonus of the Manager:");
        double bonus = sc.nextDouble();
        sc.nextLine(); // Consume the leftover newline
        Manager m = new Manager(salary, bonus, name);
        m.getDetails();
        System.out.println("Total Salary of Manager: " + m.calculateSalary());
        System.out.println();

        // Input for Developer
        System.out.println("Enter the name of the Developer:");
        String developerName = sc.nextLine(); // Now this will correctly take the name
        System.out.println("Enter the salary of the Developer:");
        double salary1 = sc.nextDouble();
        System.out.println("Enter the bonus of the Developer:");
        double bonus1 = sc.nextDouble();
        Developer d = new Developer(developerName, salary1, bonus1);
        d.getDetails();
        System.out.println("Total Salary of Developer: " + d.calculateSalary());

        sc.close();
    }
}

