package Basics;

import java.util.Scanner;

public class findQuadrant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter (x,y) point: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>0 && y>0)
            System.out.println("(x,y) is in 1st quadrant. ");
        else if(x<0 && y>0)
            System.out.println("(x,y) is in 2nd quadrant. ");
        else if(x<0 && y<0)
            System.out.println("(x,y) is in 3rd quadrant. ");
        else if(x>0 && y<0)
            System.out.println("(x,y) is in 4th quadrant. ");
        else
            System.out.println("(x,y) is in origin. ");
    }
}
