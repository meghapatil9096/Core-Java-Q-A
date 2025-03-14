package com.basic_questions.FindSecondHighest;

import java.util.Arrays;

public class WithArrays {
    static  int FindSecondHighest(int a[], int total)
    {
        Arrays.sort(a);
        return a[total-2];
    }
    public static void main(String[] args) {
        int a[] ={8,5,9,2,6};
        System.out.println("Second Highest Number is : "+FindSecondHighest(a,a.length));
    }
}
