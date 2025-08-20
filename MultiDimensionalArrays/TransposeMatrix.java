package MultiDimensionalArrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{2, 6, 3, 15, 12},
                       {4, 8, 0, 16, 2},
                       {2, 6, 12, 7, 1},
                       {32, 8, 65, 57, 1},
                       {25, 7, 2, 74, 91}};

        int n = arr.length; //n = arr[0].length;
        transpose(n, arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int n, int arr[][]) {
        for(int i=0;i<n;i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
