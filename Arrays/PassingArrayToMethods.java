package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int x[]={10,2,11,43};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] x){
        //Pass By reference

        x[2]=99;
    }

}
