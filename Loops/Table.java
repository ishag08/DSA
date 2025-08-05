package Loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int no=sc.nextInt();
        System.out.println("Table of"+ no+":");
        for(int i=1;i<=10;i++){
            System.out.println(no+" x "+ i+ "="+ no*i);
        }
    }
}
