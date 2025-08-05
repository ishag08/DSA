package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        //By default
        arr.add(25);
        arr.add(21);
        arr.add(56);
        arr.add(78);
        arr.add(99);

        System.out.println(arr.get(2)); // arr[2]
        arr.set(3,50); // arr[3]=50
        System.out.println(arr);

        int n =arr.size();

        for(int i=0;i<n;i++){
            System.out.println(arr.get(i)+" ");
        }

        int i=0,j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
        //Collections classe se reverse
        Collections.reverse(arr); //again reverse

        ArrayList<String> arr2= new ArrayList<>();

    }
}
