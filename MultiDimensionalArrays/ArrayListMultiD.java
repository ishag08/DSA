package MultiDimensionalArrays;

import Arrays.Initialization;

import java.util.ArrayList;

public class ArrayListMultiD {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(23); a1.add(210); a1.add(130);
        ArrayList<Integer> a2=new ArrayList<>();
        a2.add(53); a2.add(876);
        ArrayList<Integer> a3=new ArrayList<>();
        a3.add(1000);
        arr.add(a1);
        arr.add(a2);
        arr.add(a1);
        arr.add(a3);
        System.out.println(arr);
        a1.remove(a1.size()-1);
        a2.add(90);
        System.out.println(arr); //shallow copy
        //arr.get(i).get.(j); //i is row, j is col
        // .get() use for printing and accessing
        arr.get(0).get(0); //(0,0) element
        System.out.println(arr.get(0)); //whole 0th row
        System.out.println(arr.get(0).get(1)); //0th row and 1st col
        //change 90 to 89
        arr.get(1).set(2,89);
        arr.get(0).set(1,910); //replace 210 with 910
        //replaced in both the a1 value- 210
        System.out.println(arr);



    }
}
