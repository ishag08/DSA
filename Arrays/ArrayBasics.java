package Arrays;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr={6,19,7,69,171,5 };
        //indexing kya hoti h
        System.out.println(arr[1]);
        arr[4]=8;
        System.out.println(arr[4]);
        int arr2[]=new int[7];
        int sum=0;
        System.out.println("Enter number 7:");
        for(int i=0;i<7;i++)
        {
          arr2[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<7;i++)
        {
            //sum=
            //System.out.print(arr2[i]+sum);
        }


    }
}
