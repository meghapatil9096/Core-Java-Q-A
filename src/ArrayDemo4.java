import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int a[]=new int[4];
        a[0]=23;
        a[1]=2;
        a[2]=4;
        a[3]=20;
        int b = a.length;
        System.out.println(b);
        System.out.println("Before sorting : "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting : "+Arrays.toString(a));
    }
}
