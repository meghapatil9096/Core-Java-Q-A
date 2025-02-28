package questionanswer;

import java.util.Scanner;

/*  Armstrong Number Program    */
//  153 ---> (1*1*1  +   5*5*5  +   3*3*3)  =   153
public class ArmstrongNum {
    public static void main(String[] args) {
        int n,c,r,arm=0;
        System.out.println("Enter any number : ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;
        }
        if(c==arm)
        {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }
    }
}
