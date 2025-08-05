package Basics;

import java.util.Scanner;

public class Magnitude {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        if(n<0) n*=-1;
        if(n<69) System.out.print("Msgnitude is smaller than 69");
        else System.out.println("Magnitude is not smaller than 69");
    }
}
