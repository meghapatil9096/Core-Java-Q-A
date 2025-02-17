package main;

//public class ExceptionHand {
//    public static void main(String[] args) {
//        System.out.println("Program started");
//
//        int a=10, b=0,c;
//        try{
//            c=a/b;
//            System.out.println(c);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
//        System.out.println("Program ended");
//
//    }
//}



/*  Try - Catch - Finally */

//public class ExceptionHand {
//    public static void main(String[] args) {
//        try
//        {
//            System.out.println("Hello World");
//            int a=20, b=0, c;
//            c=a/b;
//            System.out.println(c);
//            System.out.println("No Exception");
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("Can't divide by zero");
//        }
//        finally
//        {
//            System.out.println("Finally");
//        }
//        System.out.println("Main Method Ended");
//    }
//}



/* Multiple Try catch Block */

//public class ExceptionHand
//{
//    public static void main(String[] args) {
//
//        try
//        {
//            int a=20, b=0, c;
//            c=a/b;
//            System.out.println(c);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("Can't divide by zero");
//        }
//
//        try
//        {
//            int a[] = {12,23,21,34};
//            System.out.println(a[5]);
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e);
//        }
//    }
//}




/*  Multile catch block */
//public  class ExceptionHand {
//    public static void main(String[] args) {
//
//        try
//        {
//            int a=10,b=2,c;
//            c=a/b;
//            System.out.println(c);
//
//            int arr[]={12,22,23,32};
//            System.out.println(arr[4]);
//
//            String str="aniket";
//            System.out.println(str.toUpperCase());
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("Array Exception");
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("Arithmetic Exception");
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
//    }
//}



/* Nested try - catch block  */

//public class ExceptionHand {
//    public static void main(String[] args) {
//
//        try
//        {
//            try
//            {
//                int a[]={12,23,32};
//                System.out.println(a[2]);
//            }
//            catch(ArithmeticException e)
//            {
//                System.out.println(e);
//            }
//            System.out.println(10/0);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println(e);
//        }
//        System.out.println("Ending");
//    }
//}


import java.io.IOException;
import java.util.Scanner;

/* Nested Catch block */

//public class ExceptionHand {
//
//    public void Display() throws Exception
//    {
//            System.out.println("Enter any number : ");
//            Scanner sc = new Scanner(System.in);
//            int x = sc.nextInt();
//            if(x==0)
//            {
//                throw new Exception("Not divisible by zero");
//            }
//            System.out.println(10/x);
//
//    }
//
//    public static void main(String[] args) {
//
//    ExceptionHand e = new ExceptionHand();
//    try{
//        e.Display();
//    }
//    catch (Exception e1)
//    {
//        System.out.println(e1);
//    }
//        System.out.println("Ended");
//    }




/* Throw keyword   - they are showing error of which Exception in thread "main"  in this way they are sow error */
//public class ExceptionHand {
//    public static void main(String[] args) {
////        System.out.println(10/0);
//
//        throw new ArithmeticException("Arithmetic Error / by zero");
//    }
//}



/* Throws keyword */
//public class ExceptionHand {
//    public static void main(String[] args) throws InterruptedException {
//        for (int i=0; i<10; i++) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//    }
//}



/* Throw VS Throws */

//public class ExceptionHand {
//    void div(int a, int b) {
//        if(b == 0) {
//            throw new ArithmeticException();
//        }
//        else {
//            int c=a/b;
//            System.out.println(c);
//        }
//    }
//    public static void main(String[] args) {
//        ExceptionHand e = new ExceptionHand();
//        e.div(5, 0);
//    }
//}

/* we can handle this exception with try catch block  */
//public class ExceptionHand {
//    void div(int a, int b)  throws ArithmeticException{
//        if(b == 0) {
//            throw new ArithmeticException("Division by zero");
//        }
//        else
//        {
//            int c = a / b;
//            System.out.println(c);
//        }
//    }
//    public static void main(String[] args) throws ArithmeticException {
//        ExceptionHand e = new ExceptionHand();
////      try{
////          e.div(5, 0);
////      }
////     catch(ArithmeticException ae) {
////         System.out.println("The value of b is zero");
////      }
//        e.div(5, 0);
//    }
//}




/* try catch VS Throws */
//public class ExceptionHand {
//    public  static void Wait() throws InterruptedException
//    {
//        for(int i=0;i<10;i++)
//        {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//    }
////    public static void main(String[] args) throws InterruptedException
////    {
////        Wait();
////    }
//
//    public static void main(String[] args)
//    {
//        try
//        {
//            Wait();
//            System.out.println(10/0);
//        }
//        catch (Exception e)
//        {
//            System.out.println("Exception Handled");
//        }
//        System.out.println("End of main");
//    }
//}



    /* user defined Exception   */
//class InValidAgeException extends Exception {
//    InValidAgeException(String msg) {
//        System.out.println(msg);
//    }
//}
//public class ExceptionHand {
//    public static void main(String[] args) {
//        try {
//            vote(12);
//        }
//        catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//    public static void vote(int age) throws InValidAgeException
//    {
//        if(age<18)
//        {
//            throw new InValidAgeException("Not eligible for voting");
//        }
//        else {
//            System.out.println("You are eligible for voting");
//        }
//    }
//}





/* Exception Propagation */

public class ExceptionHand {
    public static void main(String[] args) {
        m1();
    }
    public static void m1()
    {
        try{
            m2();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception Handled.....");
        }

    }
    public static void m2()
    {
        System.out.println(10/0);
    }
}