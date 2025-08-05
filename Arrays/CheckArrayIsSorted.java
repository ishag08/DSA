package Arrays;

import java.util.Scanner;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    public boolean arraySortedOrNot(int[] arr) {

        for(int i=1;i<arr.length-1;i++){ //arr.length-1 => bcoz Array should not give Out of bounds Exceptions
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
}
