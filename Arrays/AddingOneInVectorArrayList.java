package Arrays;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class AddingOneInVectorArrayList {
    // Function for adding one to the number represented by the array
    //Adding one to the last number of an array
    //whole Array elements is a number => [1 ,8,7,9]
    //Add 1 to the number
    //O/P => [1,8,8,0]
    //[9,9,9] => [1,0,0,0]
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter array size: ");
     int n=sc.nextInt();
     int[] arr=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
     }
     System.out.println("\nAfter adding 1: ");
     System.out.println(addOne(arr));
  }
    static Vector<Integer> addOne(int[] arr){
        Vector<Integer> ans=new Vector<>();
        int n=arr.length, carry=1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]+carry <= 9) {
                ans.add(arr[i] + carry);
                carry=0;
            }
            else{  //if (arr[i]+carry=10)
                ans.add(0);
                carry=1;
            }
        }
        if(carry==1) ans.add(1);
        Collections.reverse(ans);
        return ans;
    }

}
