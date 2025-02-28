package questionanswer;
//  Palindrom Number  121 ---->121
import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        int n,c,s=0,r;
        System.out.println("Enter any Number : ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
        {
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome Number");
        }
    }
}
