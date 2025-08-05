package Methods;

import java.util.Scanner;

public class BuiltIn {
    public static void main(String[] args) {
        //Math.wale
        System.out.println(Math.sqrt(100)); //Sq root
        System.out.println(Math.cbrt(100)); //Cube root
        System.out.println(Math.PI); //PI
        System.out.println(Math.abs(-658)); //-ve to +ve and vice versa=> |-m|=m
        System.out.println(Math.floor(6.8)); //round off jaisa but
        //Greatest Integer Floor
        System.out.println(Math.floor(-3.8)); //=>-4
        System.out.println(Math.ceil(3.001)); //=>4
        System.out.println(Math.ceil(-3.5)); //=>-3
        System.out.println(Math.min(3,9)); //=>3
        System.out.println(Math.max(5,8)); //=>8
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a,b,c,d: ");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        int d=sc.nextInt();
//        System.out.println(Math.max(Math.max(a,b),c));
//        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));
//        //OR
//        System.out.println(Math.max(a,Math.max(b,Math.max(c,d))));
        System.out.println(Math.pow(-3.14,6));
        System.out.println(Math.pow(0,0)); // wrong answer
        System.out.println(Math.incrementExact(16));
        System.out.println(Math.log(5));
        System.out.println(Math.random());
    }
}
