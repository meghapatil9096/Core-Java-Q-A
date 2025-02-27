package exceptionhandling;

public class Try_Catch {
    public static void main(String[] args) {
        System.out.println("Program started");

        int a=10, b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Program ended");

    }
}



