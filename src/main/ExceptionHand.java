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



// Try - Catch -Finally

public class ExceptionHand {
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
