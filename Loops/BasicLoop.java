package Loops;

import java.util.Scanner;

public class BasicLoop {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int no=sc.nextInt();
        for(int i=0;i<no;i++)
            System.out.println("Isha");
        for(int i=no;i>0;i--){
            System.out.println(i);

        }
    }
}
