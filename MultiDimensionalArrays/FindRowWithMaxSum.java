package MultiDimensionalArrays;

public class FindRowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr={{2,6,3,15,12},
                     {4,8,0,16,2},
                     {2,6,12,7,1}};
        int m=arr.length, n=arr[0].length;
        int maxSum=Integer.MIN_VALUE;
        int maxRow=-1;
        //Find row maximum sum
        for(int i=0;i<m;i++){
            int sum=0; //
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
            if(sum>maxSum) {
                maxSum = sum;
                maxRow=i;
                //maxSum=Math.max(maxSum,sum);
            }
        }
        System.out.println(maxSum+" "+ maxRow);
    }
}
