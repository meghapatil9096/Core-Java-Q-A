package main;
//Given a positive integer n, find whether the number is Palindrome or not. A number is a Palindrome if it remains the
// same when its digits are reversed.
//        Examples:
//
//Input: n = 12321
//Output: true
//Explanation: 12321 is a Palindrome number because after reversing its digits, the number becomes 12321 which is same
// as the original number.

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int n, r, s=0, c;
        System.out.print("Enter an integer : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c=n;

        while (n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==c)
        {
            System.out.println("The given number is Palindrome ");
        }
        else
        {
            System.out.println("The given number is not Palindrome ");
        }
    }
}

