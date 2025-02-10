import java.util.Scanner;

/*
Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Note :-  l and r denotes the starting and ending index of the array.

Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given
array is 7.
Example 2:

Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation :
4th smallest element in the given
array is 15.

 */

class Array1 {
    public static void main(String[] args) {

        System.out.println("Enter the size of Array : ");
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int a[] = new int[size];
        int temp;

        System.out.println("Enter the elements of Array : ");

        for(int i=0; i< a.length; i++)
        {
            a[i]=sc.nextInt();
        }


        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-1; j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Enter the elements of Array : ");
        int k=sc.nextInt();

            System.out.println(a[k]);

    }
}