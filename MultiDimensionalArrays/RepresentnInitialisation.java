package MultiDimensionalArrays;

import java.util.Scanner;

public class RepresentnInitialisation {
    public static void main(String[] args) {
        int[][] arr=new int[4][5]; //total elements=20
        //rows= 0-3; col= 0-4
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows and col: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter numbers ");

        for(int i=0;i<=r;i++){
            for(int j=0;j<=c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //arr[2][2]=4;
        for(int i=0;i<=r;i++) {
            for (int j = 0; j <= c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for( int ele: arr[0]){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("Length-Rows : "+ arr.length); // no of rows
        System.out.println("Col: "+ arr[0].length); // no of columns
        System.out.println("Col: "+ arr[1].length); // no of columns
        System.out.println("Col: "+ arr[2].length); // no of columns

        System.out.println("array2");
        int [][] arr2={{2,3,4,5},{4,6,0},{4,7,8,9}}; //jagged array
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
        }
        System.out.println("Different method: ");
        //jagged array
        //arrays of arrays
        //int [][] arr2={{2,3,4,5},{4,6,0},{4,7,8,9}};
        //arr1D pick kr rha h 1st row 2,3,4,5, 2nd,3rd
        //Using for each array
        for(int[] arr1D: arr){
            for(int ele: arr1D){
                System.out.print(ele+ " ");
            }
            System.out.println();
        }



    }
}
