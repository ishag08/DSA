package LoopsPatterns;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Row Number and column to print Star Rectangle: ");
//        int row=sc.nextInt();
//        int col=sc.nextInt();
//        for(int i=1;i<=row;i++) { //kitni lines hongi
//            for (int j = 1; j <= col; j++) { //har line mai kitna print hoga
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        System.out.print("Enter Row Number and column: ");
        System.out.print("Enter no to print Square: ");
        int no = sc.nextInt();
        for (int i = 1; i <= no; i++) { //kitni lines hongi
            for (int j = 1; j <= no; j++) { //har line mai kitna print hoga
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
