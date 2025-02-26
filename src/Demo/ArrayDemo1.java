package Demo;

import java.util.Scanner;

public class ArrayDemo1 {

    public static void main(String[] args) {
        String st[]= new String[3];
        System.out.println("Enter the elements of Array : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<st.length; i++)
        {
            st[i]=sc.next();
            System.out.println(st[i]);
        }

    }
}

