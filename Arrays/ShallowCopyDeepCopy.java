package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int a=4; //4 bytes leta h ye
        int[] arr={ 10,22,34,45}; //16 bytes continous/contigous memory in array
        int[] x=arr; //x is shallow copy of arr
        x[0]=45;
        System.out.println(arr[0]); //but still will change the value

        int[] y= Arrays.copyOf(arr,arr.length);
        y[0]=86;
        System.out.println(y[0]);
        System.out.println(arr[0]);



    }
}
