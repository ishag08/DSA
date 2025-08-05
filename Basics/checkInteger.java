package Basics;

import java.util.Scanner;

public class checkInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real number: ");
        double number = sc.nextDouble();
         //int x= (int)number;
         //if(number-(int)number != 0) System.out.println("Not an Integer");
         //else System.out.println("Is an integer");
        if(number!=(int)number) System.out.println("Not an Integer");
        else System.out.println("Is an integer");
    }
}
