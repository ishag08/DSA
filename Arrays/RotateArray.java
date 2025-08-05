package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={6,8,1,2,4,9,0};
        int n=arr.length;
         // r rotate array by 2 elements
        int d=3;
        rotateArr(arr,d);
        System.out.print(" After rotating the array: "+Arrays.toString(arr));

    }
    public static void reverse(int arr[], int i , int j){

        for(;i<j;i++,j--){
           int temp= arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
        }

    }
    public static void rotateArr(int arr[], int d){
        int n=arr.length;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

}

//class Solution { //completed on gfg
//    // Function to rotate an array by d elements in counter-clockwise direction.
//    static void rotateArr(int arr[], int d) {
//        // add your code here
//        int n =arr.length;
//        d=d%n;
//        reverse(arr,0,d-1);
//        reverse(arr,d,n-1);
//        reverse(arr,0,n-1);
//
//    }
//    private static void reverse(int[] arr, int i , int j){
//        for (; i<j; i++,j-- ){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
//    }
//
//    public static void main(String[] args){
//        int[] arr={1,2,3,4,5};
//        int d=2;
//        System.out.println("Original"+arr);
//        rotateArr(arr,d);
//        System.out.println("rotated"+arr);
//    }
//}
