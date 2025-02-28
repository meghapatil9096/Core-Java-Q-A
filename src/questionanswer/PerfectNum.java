package questionanswer;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter Any Number : ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            sum=sum+i;
        }
        if(sum==n)
        {
            System.out.println("It is Perfect Number :");
        }
        else
        {
            System.out.println("Not Perfect Number ");
        }
    }
}
