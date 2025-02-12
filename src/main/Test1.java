package main;

//Given an array, the task is to find average of that array. Average is the sum of array elements divided by the number of elements.
//        Examples :
//
//Input : arr[] = {1, 2, 3, 4, 5}
//Output : 3
//Sum of the elements is 1+2+3+4+5 = 15
//and total number of elements is 5.
//So average is 15/5 = 3

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int count=0, sum=0;

        System.out.println("Enter 5 elements");

        for(int i=0;i<a.length;i++)
        {
            Scanner sc = new Scanner(System.in);
            a[i]=sc.nextInt();
            count++;
        }
        for (int i=0;i<a.length;i++)
        {
           sum=a[i]+sum;
        }

        int avg=sum/count;
        System.out.println("Average of that array is "+avg);
    }
}
