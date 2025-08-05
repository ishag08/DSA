package LoopsPatterns;

import java.util.Scanner;

public class StarCrossHW { //Star X
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int no=sc.nextInt();
        int a=no;
        if(no%2!=0) {
            for (int i = 1; i <= no; i++) {
                for (int j = 1; j <= no; j++) {
                    if (i == j || j == a)
                        System.out.print("*");
                    else System.out.print(" ");
                }
                a--;
                System.out.println();
            }
        }
        else System.out.println("Only odd number allowed");
    }
}
