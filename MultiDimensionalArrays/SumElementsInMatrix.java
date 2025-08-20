package MultiDimensionalArrays;

public class SumElementsInMatrix {
    public static void main(String[] args) {
        int[][] arr={{2,3,4,5},{5,4,6,0},{4,7,8,9}};
        int n=arr.length; //n= rows
        int m=arr[0].length; //m=cols
        System.out.println("Sum of Elements: "+ sumOfMatrix(n,m,arr));

    }
    public static int sumOfMatrix(int n,int m, int[][] arr){
     int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              sum+=arr[i][j];
            }
        }
        return sum;
    }
}
