package Basics;

import java.util.Scanner;

public class IsProfitLoss {
    public static void main(String[] args) {
        System.out.print("Enter cost price: ");
        Scanner sc=new Scanner(System.in);
        double cp=sc.nextDouble(); //cost price
        System.out.print("Enter selling price: ");
        double sp=sc.nextDouble(); //selling price
        if(sp>cp) System.out.println("Profit is "+(((sp-cp)/cp)*100) + "%");
        else if(cp>sp) System.out.println("Loss is "+(((cp-sp)/sp)*100)+ "%");
        else System.out.println("No loss no profit");
    }
}
