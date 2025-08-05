package LoopsPatterns;

import java.util.Scanner;

public class NumberAlphabets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row and col: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int i=1;i<=row;i++) { //kitni lines hongi
            for (int j = 1; j <= col; j++) { //har line mai kitna print hoga
                System.out.print( j +" ");
            }
            System.out.println();
        }
        System.out.println("Alphabets Pattern: ");
        for(int i=1;i<=row;i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print( (char)(j+64) +" ");
            }
            System.out.println();
        }
        System.out.print("Enter no to print small Alphabets Square: ");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++) {
            for (int j = 1; j <= no; j++) {
                System.out.print( (char)(j+96) +" ");
            }
            System.out.println();
        }

    }
    }

