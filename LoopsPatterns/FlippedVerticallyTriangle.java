package LoopsPatterns;

import java.util.Scanner;

public class FlippedVerticallyTriangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int no=sc.nextInt();
        //Method1
        for(int i=1;i<=no;i++) {
            for (int j = 1; j <= no; j++) {
                if((i+j) > no)
                System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        //Method2-Modular Code --daacha define krdiya hai
        System.out.println("Method2");
        for(int i=1;i<=no;i++) {
            for (int j = 1; j <=no-i; j++) {
                    System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Method 3
        int nsp=no-1, nst=1; ///nsp =no of spaces; nst=no of stars
        for(int i=1;i<=no;i++) { //lines
            for (int j = 1; j <=nsp; j++) { //spaces
                //System.out.print("& ");
                System.out.print(" ");
            }
            for (int j = 1; j <= nst; j++) { //Stars
                System.out.print("* ");
            }
            nsp--;
            nst+=1;
            System.out.println();
        }
        System.out.println("Alphabet Vertically Flipped Triangle: ");
        for(int i=1;i<=no;i++) {
            for (int j = 1; j <=no-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        System.out.println("Number Triangle Vertically Flipped: ");
        int a=1;
        for(int i=1;i<=no;i++){
            for(int j=1;j<=no;j++){
                if ((i+j)>no)
                    System.out.print(a++ +" ");
                else
                    System.out.print("  ");
            }
            a=1;
            System.out.println();
        }
        //A \n B B \n C C C \n D D D D
        System.out.println("HW");
        for(int i=1;i<=no;i++){
            for(int j=1; j <=(no-i);j++){ // spaces
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
        System.out.println("Wrong: ");
        for(int i=1;i<=no;i++){
            for(int j=1;j<=no;j++){
                if ((i+j)>no)
                    System.out.print(j+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Wrong: ");
        for(int i=1;i<=no;i++) {
            for (int j = 1; j <=no+1-i; j++) {
                System.out.print("# ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }



    }
}
