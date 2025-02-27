package questionanswer;
//
//Given a number N, the task is to convert every digit of the number into words.
//
//        Examples:
//Input: N = 1234
//Output: One Two Three Four
//Explanation:
//Every digit of the given number has been converted into its corresponding word.


import java.util.Scanner;

public class Test3 {
    public void PrintValue(char digit)
    {
        switch(digit)
        {
            case '0':System.out.print("Zero ");break;
            case '1':System.out.print("One ");break;
            case '2':System.out.print("Two ");break;
            case '3':System.out.print("Three ");break;
            case '4':System.out.print("Four ");break;
            case '5':System.out.print("Five ");break;
            case '6':System.out.print("Six ");break;
            case '7':System.out.print("Seven ");break;
            case '8':System.out.print("Eight ");break;
            case '9':System.out.print("Nine ");break;
        }
    }
    public void Printword(String n)
    {
        int i, length=n.length();

        for (i=0;i<length;i++)
        {
            PrintValue(n.charAt(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        String n = sc.nextLine();
        Test3 obj=new Test3();
        obj.Printword(n);
    }
}
