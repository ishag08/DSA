package Loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number and Power: ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int pow=1;
        for(int i=1;i<=b;i++){
            pow=pow*a;
        }
        System.out.println(a+" raised to the power "+b+" is: "+pow);
    }
}
