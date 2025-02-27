package exceptionhandling;

/*  Try - Catch - Finally */

public class Try_Catch_Finally {
    public static void main(String[] args) {
        try
        {
            System.out.println("Hello World");
            int a=20, b=0, c;
            c=a/b;
            System.out.println(c);
            System.out.println("No Exception");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
        }
        finally
        {
            System.out.println("Finally");
        }
        System.out.println("Main Method Ended");
    }
}



