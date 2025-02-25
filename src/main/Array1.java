package main;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array : ");
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int a[] = new int[size];
        int temp;
        System.out.println("Enter the elements of Array : ");
        for(int i=0; i< a.length; i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-1; j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Enter the elements of Array : ");
        int k=sc.nextInt();

        System.out.println(a[k]);
    }
}
