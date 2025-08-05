package Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter 6 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: " );
        int targetSum=sc.nextInt();
        System.out.println(twoSum(arr,targetSum));
    }
    public static boolean twoSum(int arr[],int targetSum){
        int n=arr.length;
        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==targetSum) {
                    System.out.println((i + 1) + " " + (j + 1));
                    return true;
                }
            }
        }
        return false;
    }
}
