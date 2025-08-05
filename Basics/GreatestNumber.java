package Basics;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd  number: ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c=sc.nextInt();

//        if(a>b && a>c) System.out.println(a);
//        else if(b>c && a>c) System.out.println(b);
//        else if(c>a && c>b) System.out.println(c);

        if(a>=b){
            if(a>=c) System.out.println(a);
            else  //c>a
                System.out.println(c);
        }
        else{   //b>a
            if(b>=c) System.out.println(b);
            else //c>b
                System.out.println(c);
        }



    }
}
