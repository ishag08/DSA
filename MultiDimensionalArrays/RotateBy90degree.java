package MultiDimensionalArrays;

import java.util.Arrays;

public class RotateBy90degree {
    //anticlockwise
    public static void rotateMatrix(int[][] arr) {
        //rotate the square matrix by 90 degree anticlockwise direction
        //transpose and then reverse the column
        //TC: O(n^2) , AS: O(1)
        int n=arr.length;
        //transpose
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //reverse each column
        for(int col=0;col<n;col++){
            int i=0,j=n-1;
            while(i<j){
                int temp=arr[i][col];
                arr[i][col]=arr[j][col];
                arr[j][col]=temp;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{2, 6, 3},
                {4, 8, 0},
                {2, 6, 12}};
        int m = arr.length, n = arr[0].length;
        rotateMatrix(arr);
        for(int[] row: arr){
            System.out.println(Arrays.toString(row));
        }
    }

}
