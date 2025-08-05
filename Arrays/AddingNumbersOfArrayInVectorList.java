package Arrays;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class AddingNumbersOfArrayInVectorList {
    //Add Numbers of given ArrayNumber
    //{3,5,2,0,7} + {9,2,1}=> [3,6,1,2,8] output in VectorList
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array1 and arr2 size: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        //Input of 2 arrays
        System.out.println("Input array1: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Input array2: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("\nAfter adding both number represented as arrays(Sum): ");
        System.out.println(addNumbers(arr1, arr2));
    }

    static Vector<Integer> addNumbers(int[] arr1, int[] arr2) {
        Vector<Integer> ans = new Vector<>();
        int n1 = arr1.length, n2 = arr2.length, carry = 0;
//        for(int i=n1-1;i>=0;i--) { //this will not work dumbor bcoz we are addding every element of arr1 to every elemtn of arr2
//            for (int j = n2 - 1; j >= 0; j--) { which will ofcourse give you lengthy answer  uff girl what you doing FOCUS FOCUS
        int i = n1 - 1, j = n2 - 1;
        while (i >= 0 || j >= 0) {
//                if(!(i>=0)) arr1[i]=0;
//                if(!(j>=0)) arr2[j]=0; //you can do better
            int d1 = i >= 0 ? arr1[i] : 0;
            int d2 = j >= 0 ? arr2[j] : 0;

            int sum = d1 + d2 + carry;
            int ldigit = sum % 10;
            ans.add(ldigit);
            carry = sum / 10;
            System.out.println("i=" + i + ",j=" + j + ",digit1=" + d1 + ",digit2=" + d2 +",ldigit="+ldigit+ ",sum=" + sum + ",carry=" + carry + ",ans=" + ans); //for checking if it is working properly or not

        if (i >= 0) i--;
        if (j >= 0) j--;
        //            if (j < 0) {
//                ans.add(arr1[i] + carry);
         }
        //ans.add(arr1[i] += carry);
        if (carry ==1) ans.add(1);
        Collections.reverse(ans);

        return ans;
    }
}
//Time complexity=>  O(max(n1,n2))
// ex=> max(n1,n2)=> 5(n1)
//cal d1,d2 => O(1); same for sum,ldigit,carry=> O(1)
//ans.add()=> O(1) and same for decrementing i and j
//reversing => O(m) ; m==max(n1,n2)

