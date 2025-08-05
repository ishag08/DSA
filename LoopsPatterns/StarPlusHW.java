package LoopsPatterns;

import java.util.Scanner;

public class StarPlusHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no(odd no): ");
        int no = sc.nextInt();
        if (no % 2 != 0) {
            int mid = no / 2 + 1;
            for (int i = 1; i <= no; i++) {
                for (int j = 1; j <= no; j++) {
                    if (i == mid || j == mid)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Not an Odd number. ");
    }
}
