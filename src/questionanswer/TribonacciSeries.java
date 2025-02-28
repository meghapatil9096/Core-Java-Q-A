package questionanswer;

import java.util.Scanner;

public class TribonacciSeries {;
    public static void main(String[] args) {
        int n, a=0,b=1,c=2,d;
        System.out.println("Enter series number : ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }
}
