package Loops;

public class ASCII {
    public static void main(String[] args) {
        for(int i=65;i<=90;i++){
            System.out.print(" "+(char)i+"="+ i);
        }
        System.out.println();
        for(int i=97;i<=122;i++){
            System.out.print(" "+ (char)i+"="+i);
        }
    }
}
