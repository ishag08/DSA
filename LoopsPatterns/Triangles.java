package LoopsPatterns;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    System.out.println("Alphabets Triangle: ");
    for(int i=1;i<=no;i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print((char)(j+64) +" ");
        }
        System.out.println();
    }
        System.out.println("Numbers Triangle: ");
        for(int i=1;i<=no;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
        //HW
        System.out.println("Alphanumeric/Mixed Triangle(HW): ");
        for(int i=1;i<=no;i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2!=0)
                System.out.print(j +" ");
                else System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
 }
}
