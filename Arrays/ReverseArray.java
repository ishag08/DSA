package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //Method 1
        int[] arr={2,6 ,7 ,8,21, 9,18,99,12 ,56};
        int n=arr.length;
        int i=0,j=n-1;
        //int i=2,j=5;  for reversing specific parts only
        // called reverse part of array

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele: arr)
            System.out.print(ele+" ");
        //Method 2
//        for(int i=0;i<n/2;i++){
//            int temp=arr[i];
//            arr[i]=arr[n-1-i];
//            arr[n-1-i]=temp;
//        }

    }
}
//        for(int i=n-1;i>=0;i--){
//            System.out.print(arr[i]+" "); //ye ulta print horha hai
//            WE HAVE TO REVERSE THE VALUES IN THE ARRAY IT SELF INSTEAD
//            OF JUST PRINTING IN BACKWORDS
//        }
