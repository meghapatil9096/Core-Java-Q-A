package questionanswer;

import java.util.Scanner;
// W.A.P to print Fibaonacci Series
//  0 1 1 2 3 5 8 13 ....
public class FibonacciSeries {
    public static void main(String[] args) {
        int n,a=0,b=1,c;
        System.out.println("Enter any Number : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
