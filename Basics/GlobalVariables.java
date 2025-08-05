package Basics;

public class GlobalVariables {
    static int x=10; //static global variable
    //static value is same everywhere even if we changed it the change value is updated
    public static void main(String[] args) {
        //fun();
        x=9;
        System.out.println(x);
        int x=4;
        System.out.println(x);
        x=6;
        System.out.println(x);
    }

    public static void fun() {
        x=20;
        //System.out.println(x);
    }
}
