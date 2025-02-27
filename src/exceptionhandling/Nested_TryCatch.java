package exceptionhandling;
/* Nested try - catch block  */
public class Nested_TryCatch {
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

