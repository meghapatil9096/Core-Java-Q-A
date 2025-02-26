package Demo;

import java.util.Scanner;

public class ArrayDemo2 {

     void get()
    {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        ArrayDemo2 obj = new ArrayDemo2();
        obj.get();
    }
}
