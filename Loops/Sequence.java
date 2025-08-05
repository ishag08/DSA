package Loops;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        //Print sequence :
        // 1, n, 2,n-1,3,n-2
        //Example: no=5 => 1,5,2,4,3,3,4,2,5,1,6,0

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        int no=sc.nextInt();
        for(int i=1;(i>0 && no>=0);i++){
            System.out.print(i+" "+ no+" ");
            no--;
        }
    }
}
