package MultiDimensionalArrays;

public class PrintColumnWise {
    public static void main(String[] args) {
        int[][] arr={{2,6,3,15,12},
                {4,8,0,16,2},
                {2,6,12,7,1}};
        //int m=arr.length, n=arr[0].length;
        colWise2D(arr);
        System.out.println("Reverse Row");
        print(arr);

    }

    public static void colWise2D(int[][] arr){
        int m=arr.length, n=arr[0].length;
        for(int i=0;i<n;i++){ //
            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void print(int[][] arr){
        int m=arr.length, n=arr[0].length;
        for(int i=0;i<m;i++){ // rows
            for(int j=n-1;j>=0;j--){ //col
                System.out.print(arr[i][j]+" "); //reverse row print
            }
            System.out.println();
        }
    }
}



