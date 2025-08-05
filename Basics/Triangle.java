package Basics;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a side1: ");
    int a= sc.nextInt();
    System.out.println("Enter a side 2: ");
    int b= sc.nextInt();
    System.out.println("Enter a side 3: ");
    int c= sc.nextInt();

    if(a+b > c && b+c>a && c+a>b) System.out.println("Valid Triangle ");
    else System.out.println("Invalid Triangle");
}
}
