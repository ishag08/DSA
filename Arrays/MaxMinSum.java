package Arrays;

import java.util.Scanner;

public class MaxMinSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[]=new int[7];
        int max=arr[0];
        max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        System.out.print("Enter 7 numbers: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max)
                max = arr[i];
            else if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Maximum element: "+max);
        System.out.println("Minimum element: "+min);

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of the all the elements is:"+ sum);
    }
}
