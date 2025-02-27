package exceptionhandling;



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