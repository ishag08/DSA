package MultiDimensionalArrays;

public class SearchIn2DMatrixII {
    public static void main(String[] args) {

    }
    //240 leetcode
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length, n=arr[0].length;
        int i=0, j=n-1;
        //staircase approach
        while(i<m && j>=0){
            if(arr[i][j]==target) return true;
            else if(arr[i][j]<target) i++; //go down
            else j--;
        }
        return false;
    }
}
