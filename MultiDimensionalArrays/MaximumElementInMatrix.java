package MultiDimensionalArrays;

public class MaximumElementInMatrix {
    public static void main(String[] args) {
        int[][] arr={{85,34,65,45},{12,36,88,51},{99,24,4,71}};
        int n=arr.length; //n= rows
        int m=arr[0].length; //m=cols
        System.out.println("Max Element: "+ MaxEleMatrix(n,m,arr));

    }

    private static int MaxEleMatrix(int n,int m, int[][] arr) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]>max)
                    max=arr[i][j];
                else if(arr[i][j]<min)
                    min=arr[i][j];
            }
        }
        System.out.println("Minimum Element: "+ min);
        return max;
    }

}
