package MultiDimensionalArrays;

public class MultiplyMatrices {
    public static void main(String[] args) {


    }
    public static void multiply(int a[][], int b[][], int c[][], int n) {

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //c[i][j]= ith row of a * (jtth col of b)
                for(int k=0;k<n;k++){
                    c[i][j]+=(a[i][k]*b[k][j]);
                }
            }

        }
    }

}
