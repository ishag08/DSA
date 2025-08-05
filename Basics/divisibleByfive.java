package Basics;

import java.util.Scanner;

public class divisibleByfive {
    public static void main(String[] args) {
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        no= sc.nextInt();

        if(no%5==0 && no%3==0 )
            System.out.println(" The "+ no + " is divisible by 5 and 3 ");
        else if(no%5 ==0)
            System.out.println("The " + no +" is divisible by 5 ");
        else if(no%3 ==0)
            System.out.println("The " + no +" is divisible by 3 ");
        else
            System.out.println("Not divisible by 5 or 3");

    }
}
