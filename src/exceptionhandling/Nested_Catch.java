package exceptionhandling;


/* Nested Catch block */

import java.util.Scanner;

public class Nested_Catch {

    public void Display() throws Exception {
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 0) {
            throw new Exception("Not divisible by zero");
        }
        System.out.println(10 / x);

    }

    public static void main(String[] args) {

        Nested_Catch e = new Nested_Catch();
        try {
            e.Display();
        } catch (Exception e1) {
            System.out.println(e1);
        }
        System.out.println("Ended");
    }
}



