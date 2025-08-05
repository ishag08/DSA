package Loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        int n=sc.nextInt();
        if(n==0) n=1; //So that number of digits should be 1; n can be in between 1-9
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println("No of digits:"+ count);
    }
}
