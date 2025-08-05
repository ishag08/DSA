package Basics;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        int r;
        char ans;
        Scanner sc = new Scanner(System.in);

        System.out.println("Wanna calculate Volume of Sphere- write 's';TSA for Cuboid- write 'c'; Square of number- write 'n' ");
        ans=sc.next().charAt(0);
        if( ans=='s') {
            System.out.print("Enter radius: ");
            r = sc.nextInt();
            volSphere(r);
        }
        else if(ans=='c') {
            System.out.println("Enter length,breadth, height of a Cuboid: ");
            int l = sc.nextInt();
            int b = sc.nextInt();
            int h = sc.nextInt();
            totalSurfaceArea(l,b, h);
        }
        else if(ans=='n'){
            System.out.print("Enter number: ");
            int no=sc.nextInt();
            System.out.println("The square of a number is: "+ (no*no));

        }

    }
    static void volSphere(int r){
        double volume;
        volume = (4.0 / 3.0) * 3.14 * r * r * r;
        System.out.print(" Volume of the sphere: " + volume);
    }

    static void totalSurfaceArea(int l, int b, int h) {

        double TSA = 2 * (l * b + b * h + h * l); //TSA=Total surface area
        System.out.println("Total Surface Area of Cuboid = " + TSA);
    }

}


