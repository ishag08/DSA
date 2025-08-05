package Arrays;

public class MergeTwoSortedArrays { //in a single big array c
    //Merge 2 sorted arrays with extra space
    public static void main(String[] args) {
        int[] a={2,5,6,9,20};
        int[] b={1,3,4,5,7,8}; //j
        int[] c=new int[a.length+b.length]; //j

        for(int ele: c){
            System.out.print(ele+" ");
        }
        System.out.println();
        merge(c,a,b);
        for(int ele: c){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
                //i++;
                //k++; or
                //c[k++]=a[i++];
            }
            else {
                c[k++] = b[j++];
                //j++;
                //k++;
            }
            //or
            //c[k++]=(a[i]<b[j]) ? a[i++]: b[j++];
        }
//
         while(i<a.length) {
             c[k++] = a[i++];
         }
         while(j<b.length) {
             c[k++] = b[j++];
         }
    }
}
//samee question but with different technique
//piche se bharna hai ans c
//HW take 3 arrays and merge in different arrays

