package Loops;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of evens number to be print: ");
        int no = sc.nextInt();
        for (int i = 1; i < no; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.print("\nEnter number of Odd number,also divisble by three between 1 to 100: ");
        int no2 = 100;
        for (int i = 1; i <= no2; i++) {
            if (i % 2 != 0 && i % 3 == 0)
                System.out.print(i + " ");
        }
    }
}
