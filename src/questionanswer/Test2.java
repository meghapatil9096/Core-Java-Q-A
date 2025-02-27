package questionanswer;

//Given a number, the task is to check if a number is divisible by 6 or not. The input number may be large and it may not be possible to store even if we use long long int.
//Examples:
//
//Input  : n = 2112
//Output: Yes
//
//Input : n = 1124
//Output : No
//
//Input  : n = 363588395960667043875487
//Output : No

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        long a;

        System.out.print("Enter an number : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

       if(a%6==0)
       {
           System.out.println("Yes");
       }
       else {
           System.out.println("No");
       }

    }
}
