package Basics;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        no = sc.nextInt();
        if (no > 999 && no < 10000) System.out.println("4 Digit Number");
        else System.out.println("Not a 4 Digit Number");

    }
}
