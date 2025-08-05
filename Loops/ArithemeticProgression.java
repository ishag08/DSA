package Loops;

import java.util.Scanner;

public class ArithemeticProgression {
    public static void main(String[] args) {

        /*An Arithmetic Progression (AP) is a sequence of numbers where the difference between consecutive terms is constant.
        2, 5, 8, 11, 14... → Difference between terms is +3, so it's an AP. */

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int no=sc.nextInt();
        for(int i=2; i<(3*no-1);i+=2){
            //a=a+(n-1)d
            System.out.print(i + " "); //AP starting from 2 and difference of 3
        }
        System.out.println();
        int a=3,d=4;
        for(int i=1;i<no;i++){
            System.out.print(a+ " ");
            a=a+d;
        }

    }
}
