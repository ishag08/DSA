package LoopsPatterns;

import java.util.Scanner;

public class FlippedHorizontallyTriangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int no=sc.nextInt();
        System.out.println("Star Triangle: ");
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j<=no+1-i; j++) {
                System.out.print( "*  ");
            }
            System.out.println();
        }
        int a=no; //no of stars to be printed in each line(col)
        System.out.println("Numbers Triangle: ");
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j<=a; j++) {
                System.out.print(j+ " ");
            }
            a--;
            System.out.println();
        }
        System.out.println("Aphabets Triangle: ");
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j<=no+1-i; j++) {
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println();
        }
        System.out.println("Small Aphabets Triangle: ");
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j<=no+1-i; j++) {
                System.out.print((char)(j+96)+ " ");
            }
            System.out.println();
        }
    }
}
