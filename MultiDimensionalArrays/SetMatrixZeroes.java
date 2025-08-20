package MultiDimensionalArrays;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {{3, 6, 2},
                       {8, 0, -2},
                       {0, 5, 6}};
        setMatrixZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }
    public static void setMatrixZeroes(int[][] arr) {
        //Approach 1:
        int m=arr.length, n=arr[0].length;
//        boolean[] row=new boolean[m]; //false
//        boolean[] col=new boolean[n]; //false
//        //travel the array and find zeroes
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(arr[i][j]==0){
//                    row[i]=true;
//                    col[j]=true;
//                }
//            }
//        }
//        //mark rows zero
//        for(int i=0;i<m;i++){
//            if(row[i]==true){ //mark ith row of arr 0
//                for(int j=0;j<n;j++){
//                    arr[i][j]=0;
//                }
//            }
//        }
//        //mark cols zero
//        for(int j=0;j<n;j++){
//            if(col[j]==true){ //mark jth col of arr 0
//                for(int i=0;i<m;i++){
//                    arr[i][j]=0;
//                }
//            }
//        }
            //Approach 2:
            //we will take the 0th row and 0th col as the check array
            //remaining arr starting of 1st col and row is like a sub array
            // we will check excluding the 0th row and col for a zero and if we found then we will make that row 0th ele and 0th col zero and then make the whole row and col zero

            //check zeroth row and col pehle
        boolean zerothRow=false;
        for(int j=0;j<n;j++){ //check 0th row for a zero
            if(arr[0][j]==0){
                zerothRow=true;
                break;
            }
        }
        boolean zerothCol=false;
        for(int i=0;i<m;i++){ //check 0th col for a zero
            if(arr[i][0]==0){
                zerothCol=true;
                break;
            }
        }
        //travel the sub-matrix and find zeroes
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
             if(arr[i][j]==0){
                 arr[i][0]=0;
                 arr[0][j]=0;
               }
            }
        }
        //make rows zero(travel 0th col from 1st index ie the check matrix)
        for(int i=1;i<m;i++){
            if(arr[i][0]==0){
                for(int j=1;j<n;j++){
                    arr[i][j]=0; //mark ith row of arr 0
                }
            }
        }
        //make col zeros(travel 0th row from 1st index)
        for(int j=1;j<n;j++){
            if(arr[0][j]==0){
                for(int i=1;i<m;i++){
                    arr[i][j]=0; //mark jth col of arr 0
                }
            }
        }
        //if original matrix of 0th row and 0th col has 0 then we have to mark that row and col zero
            if(zerothRow==true){
                for(int j=0;j<n;j++){
                    arr[0][j]=0;
                }
            }
            if(zerothCol==true){
                for(int i=0;i<m;i++){
                    arr[i][0]=0;
                }
            }

        }

}

