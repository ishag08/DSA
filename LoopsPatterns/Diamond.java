package LoopsPatterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: ");
        int no=sc.nextInt();
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
        nsp=1; nst=2*no-3;
        for(int i=1;i<=no;i++) { //lines
            for (int j = 1; j <=nsp; j++) { //spaces
                System.out.print("& ");
            }
            for (int j = 1; j <= nst; j++) { //Stars
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        int nsp = n-1, nst = 1;
//
//        for(int i=1;i<=n;i++){ // lines
//
//            for(int j=1;j<=nsp;j++){ // spaces
//
//                System.out.print(" "+" ");
//
//            }
//
//            for(int j=1;j<=nst;j++){ // stars
//
//                System.out.print("*"+" ");
//
//            }
//
//            nsp--; nst += 2;
//
//            System.out.println();
//
//        }
//
//        nsp = 1; nst = 2*n-3;
//
//        for(int i=1;i<=n-1;i++){ // lines
//
//            for(int j=1;j<=nsp;j++){ // spaces
//
//                System.out.print(" "+" ");
//
//            }
//
//            for(int j=1;j<=nst;j++){ // stars
//
//                System.out.print("*"+" ");
//
//            }
//
//            nsp++; nst -= 2;
//
//            System.out.println();
//
//        }

    }
}
