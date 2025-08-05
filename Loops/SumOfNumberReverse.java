package Loops;

import java.util.Scanner;

public class SumOfNumberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no:");
        int n = sc.nextInt();
        int temp=n, rev=0;
        while(n!=0){
            rev*=10;
            rev+=n%10;
            n/=10;

        }
        System.out.println("Sum of Number and Reverse: "+ (int)(temp+rev));
    }
    }

