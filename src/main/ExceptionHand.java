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

//  Try - Catch - Finally

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



// Multiple Try catch Block

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




// Multile catch block
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



// Nested try - catch block

public class ExceptionHand {
    public static void main(String[] args) {

        try
        {
            try
            {
                int a[]={12,23,32};
                System.out.println(a[2]);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Ending");
    }
}
