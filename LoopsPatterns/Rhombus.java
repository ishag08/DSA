package LoopsPatterns;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int no=sc.nextInt();
        //PatternStarTriangleVerticallyFlipped
        //Method2-Modular Code --daacha define krdiya hai
        for(int i=1;i<=no;i++) {
            for (int j = 1; j <=no-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= no; j++) { //Square
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
