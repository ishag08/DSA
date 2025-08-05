package LoopsPatterns;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and col to print Number pattern Rectangle/Square: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(i + " ");
                //O/P: 1 1 1 1 \n 2 2 2 2 \n 3 3 3 3
            }
            System.out.println();
        }
        System.out.println("Alphabets Rectangle/Square a b c d e");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print((char) (i + 64) + " ");
                //O/P: A A A A \n B B B B \n C C C C ....
            }
            System.out.println();
        }
        System.out.print("Enter a no for small and capital alphabet square:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) System.out.print((char) (i + 96) + " ");
                else System.out.print((char) (i + 64) + " ");
                //O/P: a a a a \n B B B B \n c c c c ....
            }
            System.out.println();
        }
        System.out.println("Alphabets Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 64) + " ");
                //O/P: A \n B B \n C C C \n D D D D ....
            }
            System.out.println();
        }
            System.out.println();
            System.out.println("Alphabet and Number square:");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print( (i % 2 != 0) ? (i + " ")  : ((char)(i + 64) + " "));
                    //O/P: a a a a \n B B B B \n c c c c ....
                }
                System.out.println();

            }
        System.out.println("OddNumberTriangle: ye galti se print hogya but correct hai  ");
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(a%2!=0){
                    System.out.print(a++ +" ");
                }
                a++;
            }
            System.out.println();
        }
        System.out.println("OddNumberTriangle: ");
        for(int i=1;i<=n;i++){
            //int t=1;
            for(int j=1;j<=i;j++){
                System.out.print(2*j-1 +" ");
                //sout(t); t+=2;
            }
            System.out.println();
        }
        //* * * * * \n  * * * * \n   * * * \n    * * \n    *
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}


