import java.util.Arrays;
import java.util.Scanner;
//  String with nextLine()
public class ArrayHW1 {
    public static void main(String[] args) {
        String[] a = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements : ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(a));
    }
}
