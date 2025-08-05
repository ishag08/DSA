package Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            rev*=10;
            rev+=n%10;
            n/=10;
        }
        System.out.println("Reverse: "+ rev);
    }
}
