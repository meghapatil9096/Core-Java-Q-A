package questionanswer;

import java.util.Scanner;

// Sum of n Natural Numbers
public class SumOfNaturalNum {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1; i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of all "+" Natural Number Is "+sum);
    }
}
