package Loops;

import java.util.Scanner;

public class PrimeComposite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        int n=sc.nextInt();
        boolean flag=true;
        //else {
        for (int i = 2; i <Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.print(i+" ");
                    flag = false;
                    break;
                }

            }
        //}
        if(n<=1) System.out.println("Neither Prime not Composite ");
        else if(flag==true) System.out.println("Prime");
        else System.out.println("Composite");

        //Print all factors
        System.out.println("Factors: ");
        for(int i=1;i<n;i++){
            if(n%i==0){
               System.out.print(i+" ");
               //if(i!=n) System.out.print(n/i+" ");
           }
        }

    }


}
