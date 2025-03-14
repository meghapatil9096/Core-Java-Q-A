package com.basic_questions.FindSecondHighest;

public class FindSecond_Largest {
    static int m1(int a[], int total)
    {
        int temp = 0;
        for(int i=0; i<total; i++)
        {
            for(int j=i+1; j<total; j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String[] args) {

        int a[] ={3,5,6,9,2,8,7};
        System.out.println("second largest :" +m1(a,a.length));
    }
}
