package main;

//You are given an array arr[]. Your task is to count the number of even and odd elements. Return first odd count then even count.
//
//        Examples:
//
//Input: arr = [2, 3, 4, 5, 6]
//Output: 2 3
//Explanation: There are two odds[3, 5] and three even[2, 4, 6] present in the array.
//
//Input: arr = [22, 32, 42, 52, 62]
//Output: 0 5
//Explanation: All the elements are even.

public class Test {
    public static void main(String[] args) {
        int a[]={2,3,4,5,6};
        int count=0, count1=0;

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                count++;
            }
            else
            {
                count1++;
            }
        }
        System.out.println("Even count is "+count);
        System.out.println("Odd count is "+count1);
    }
}
