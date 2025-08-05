package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.print("Enter 7 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to be searched: ");
        int tobefind = sc.nextInt();
        int found=-1; // flag if false if the target is not found
        for (int i = 0; i < arr.length; i++) {
            if (tobefind == arr[i]) {
                found=i;
                //System.out.print("The no is at position: " + (i + 1));
            }
            if(found!=-1) System.out.println("The target is at indexed: " + (i + 1));
            else System.out.println("Target missind in the array");

        }
    }
}

