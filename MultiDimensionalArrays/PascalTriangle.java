package MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        //Printing pascal triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of lines");
        int n = sc.nextInt();
        //Method1: //Without ArrayList
        Pascal(n);
        System.out.println("Nth Row: " +nthRowOfPascalTriangle(n));
    }

    public static void Pascal(int n) {
        //n! , r! factorial ke liye loop ya function
        //Time comp: n*2n =O(n^2)
        //A.S=O(n)
        //nCr ko fast kaise nikale??
        //aise = create fact array
        //fact*=i
        //nCr+1=(n-r)/(r-1))*nCr
        for (int i = 0; i < n; i++) {
            //spaces
            for (int sp = 0; sp < n - i - 1; sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + " ");
            }
            System.out.println();
        }
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int nCr(int n, int r) { //combination= nCr
        int ncr = fact(n) / (fact(r) * fact(n - r));
        return ncr;
    }

    //Method3: With ArrayList
    //nCr =>nC0,nC1....
    //for(int r=0;r<=n;r++){
    //  ans.add(nCr);
    //}
    //TC: O(n^2)

    //gfg Pascal Triangle / 119 Leetcode Pascal Triangle II
    static ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        //create an arraylist ie structure/ dhancha and initialise with 0
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> a = new ArrayList<>(); //har baar jab loop chalega toh new arraylist banegi
            for (int j = 0; j <= i; j++) {
                a.add(0);
            }
            arr.add(a); //if you dont understand this
            // go study how to create 2D ArrayList
        }
        //you can just add the values in above loop also
        //fill values of pascal triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) //arr[i][j]=1
                    arr.get(i).set(j, 1);
                else {
                    //arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                    arr.get(i).set(j, arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1));
                    //if you dont understand above statement
//                    int up=arr.get(i-1).get(j);
//                    int upLeft=arr.get(i-1).get(j-1);
//                      arr.get(i).set(j,up+upLeft);
                }
            }
        }
       return arr.get(n-1);
    }
}
