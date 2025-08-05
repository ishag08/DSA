package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        convertToWave(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void convertToWave(int[] arr){

        for(int i=0;i<arr.length-1;i+=2){
            int j=i+1;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
