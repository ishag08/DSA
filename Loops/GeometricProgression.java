package Loops;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        /*A Geometric Progression (GP) is a sequence of numbers where each term is obtained by multiplying the previous term by a fixed common ratio (r).*/

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int no=sc.nextInt();
        int a=1, r=2;
        //GP=1,2,4,8,.....

        for(int i=0;i<no;i++){
            System.out.print(a+" ");
            a*=r;
        }
        System.out.println();
        for(int i=99;i>0;i=i-4){
            System.out.print(i+ " ");

        }
    }
}
