package MultiDimensionalArrays;

import java.util.ArrayList;

public class SpirallyTraversingMatrix{
    public static void main(String[] args) {

    }
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        // code here
        ArrayList<Integer> ans =new ArrayList<>();
        int m=arr.length, n=arr[0].length;
        int minR=0, maxR=m-1,minC=0, maxC=n-1;
        //sout ke =>ans.add(arr[i][maxC])
        while((minR<=maxR)&& minC<=maxR){
            for(int j=minC;j<=maxC;j++){
                ans.add(arr[minR][j]);
            }
            minR++;
            for(int i=minR;i<=maxR;i++){
                if(minR>maxR || minC>maxC) break;
                ans.add(arr[i][maxC]);
            }
            maxC--;
            for(int j=maxC;j>=minC;j--){
                if(minR>maxR || minC>maxC) break;
                ans.add(arr[maxR][j]);
            }
            maxR--;
            for(int i=maxR;i>=minR;i--){
                if(minC>maxC || minC>maxC) break;
                ans.add(arr[i][minC]);
            }
            minC++;
        }
        return ans;
    }

}
