import java.util.Arrays;
import java.util.Scanner;
// String with next()
public class ArrayHW2 {
    public static void main(String[] args) {
        String[] a = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements : ");
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.next();
        }
        System.out.println( Arrays.toString(a));
    }
}
