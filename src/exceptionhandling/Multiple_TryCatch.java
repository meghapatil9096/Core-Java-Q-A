package exceptionhandling;
/* Multiple Try catch Block */

public class Multiple_TryCatch
{
    public static void main(String[] args) {

        try
        {
            int a=20, b=0, c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
        }

        try
        {
            int a[] = {12,23,21,34};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}




