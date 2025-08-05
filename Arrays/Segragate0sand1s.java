package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Segragate0sand1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 7 numbers:");
        int[]arr=new int[7];
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print(Arrays.toString(segregate0and1(arr)));

    }
    static int[] segregate0and1(int[] arr) {
        // code here
//        int numberOfZeros=0;
//        //int numberOfOnes=0; // no need
//        for(int ele: arr){
//            if(ele==0) numberOfZeros++;
//            //else numberOfOnes++;
//        }
//        //2 pass solution = bcoz we travel the array two times
//        for(int i=0;i<=numberOfZeros;i++){
//           arr[i]=0;
//        }
//        for(int i=numberOfZeros;i<arr.length;i++){
//            arr[i]=1;
//        }
//      return arr;
        //2 pointer method --
        int i=0,j=arr.length-1;
        while(i<j) {
            if (arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
            else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
      return arr;
    }
}
