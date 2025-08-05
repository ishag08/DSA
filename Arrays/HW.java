package Arrays;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[7];
        System.out.print("Enter 7 numbers: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //HW: Product Of Array
        int product=1;
        for(int i=1;i<arr.length;i++){
            product*=arr[i];
        }
        System.out.println("Product of all elements: "+ product);
        //HW2: Multiply odd indexed elements by 2 and add 10 to even indexed elements
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]+=10;
            }
            else if(i%2!=0) arr[i]*=2;

            System.out.print(arr[i]+" ");
        }


    }
}
