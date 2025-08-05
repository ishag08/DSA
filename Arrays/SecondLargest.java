package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        //Second Largest or second Maximum

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE; //secondMax or secLargest

        System.out.print("Enter 7 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secmax && arr[i] != max)
                secmax = arr[i];
        }
        System.out.println("second Largest/Maximum element: "+ secmax);


//            int[] arr = {-6, 8, 14, -2, 23, 47, 4, 3, 10};
//
//            int max = Integer.MIN_VALUE;
//
//            int secondMax = Integer.MIN_VALUE;
//
//            for (int i = 0; i < arr.length; i++) {
//
//                if (arr[i] > max) {
//
//                    secondMax = max;
//
//                    max = arr[i];
//
//                } else if (arr[i] > secondMax && arr[i] != max) {
//                    secondMax = arr[i];
//                }
//            }
//            System.out.println("Second maximum number is: " + secondMax);
//
//        }
//
//    }
    }
}
