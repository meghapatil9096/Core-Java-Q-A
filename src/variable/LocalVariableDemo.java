package variable;

public class LocalVariableDemo {
//
    void put(int temp)   //parameter temp also local variable
    {
        //local variable
        int a=23,b=12;
         temp=a+b;
        System.out.println("Sum of two number is "+temp);
    }
    public static void main(String[] args) {
            LocalVariableDemo obj = new LocalVariableDemo();
            int t = 0;
            obj.put(t);
    }
}
