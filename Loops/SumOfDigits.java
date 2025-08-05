package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no:");
        int n = sc.nextInt();
        int sum=0;
        //int rem=0;
        while(n!=0){
            //rem=n%10;
            //sum=sum+rem;
            sum+=n%10;
            n=n/10;
        }
        System.out.println("Sum of Digits:" + ((sum>0)? sum : -sum));
    }
}