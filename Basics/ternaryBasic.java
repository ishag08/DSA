package Basics;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ternaryBasic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();
//
//        System.out.println((number%2==0) ? "Even": "Odd");
        int a=7,b=9,c=2;
        int max= (a>b)? ((a>c)?a:c) : ((b>c)?b:c);
        System.out.println(max);
    }
}
