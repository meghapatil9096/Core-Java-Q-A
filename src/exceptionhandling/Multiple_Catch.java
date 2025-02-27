package exceptionhandling;

/*  Multile catch block */
public  class Multiple_Catch {
    public static void main(String[] args) {

        try
        {
            int a=10,b=2,c;
            c=a/b;
            System.out.println(c);

            int arr[]={12,22,23,32};
            System.out.println(arr[4]);

            String str="aniket";
            System.out.println(str.toUpperCase());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Exception");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}



