package Arrays;

import java.util.Scanner;

public class MissingArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.print("Enter 7 numbers: ");
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Missing number is: "+ missingNum(arr));

    }

        public static int missingNum ( int arr[]){
            // code here
            long n = arr.length + 1; // 1 to n tak numbers honge array mai
            long sum = n * (n + 1) / 2;
            long arraySum = 0;

            for (int ele : arr) {
                arraySum += ele;
            }
            int miss=(int)(sum - arraySum);
            return miss;
        }
        // 1 ≤ arr.size() ≤ 106
        // 1lakh * 1 lakh => sum ke formula mai
        //cannot store in int
        //sum can be very very long
}


