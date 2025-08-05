package Basics;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        System.out.println("Enter Principal amount, rate and time for calculating Simple Interest: ");
        Scanner sc=new Scanner(System.in);

        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        //p=principle; r=rate; t=time

        double SI = p * r * t / 100;
        System.out.println("Simple Interest= "+ SI);

    }
}

