package LoopsPatterns;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: ");
        int no=sc.nextInt();
        System.out.println("Method 1: ");
        for(int i=1;i<=no;i++) { //lines
            for (int j = 1; j <=no-i; j++) { //spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) { //Stars
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Method2: ");
        int nsp=no-1, nst=1; ///nsp =no of spaces; nst=no of stars
        for(int i=1;i<=no;i++) { //lines
            for (int j = 1; j <=nsp; j++) { //spaces
                System.out.print("& ");
            }
            for (int j = 1; j <= nst; j++) { //Stars
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
//        for(int i=1;i<=no;i++) {
//            for (int j = 1; j <= no; j++) {
//                if((i+j) > no)
//                    System.out.print("* ");
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
        for(int i=1;i<=no;i++){
            for(int j=1;j<=no-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=no;i++){
            for(int j=1;j<=no-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
