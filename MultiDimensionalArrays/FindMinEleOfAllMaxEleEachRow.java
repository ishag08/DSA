package MultiDimensionalArrays;

public class FindMinEleOfAllMaxEleEachRow {
    public static void main(String[] args) {
        //Find minimum element out of all maximum elements
        //of each row
        int[][] arr={{2,3, 85,9,3,4},
                {3,63,15,7,42,2},
                {1,11,33,5,17,25}};
        int m=arr.length, n=arr[0].length;
        int minRow=-1;
        int minOfMax=Integer.MAX_VALUE; //out of all the Max elements of each row
        //Find row maximum number
        for(int i=0;i<m;i++) {
            int rowMax = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > rowMax) {
                    rowMax = arr[i][j];
                }
            }
            if(i==0) minOfMax=rowMax;
            else if (rowMax < minOfMax) {
                    minOfMax = rowMax;
                    minRow = i;
                }
            }

        System.out.println(minOfMax+" "+(minRow+1));

    }
}
