package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n ,r");
        int n=sc.nextInt();
        int r=sc.nextInt();

        int ncr=fact(n)/(fact(r)*fact(n-r));
        int npr=fact(n)/fact(n-r);
        System.out.println(ncr+ " "+ npr);

//        int nFact=1;
//        for(int i=1;i<=n;i++){
//            nFact*=i;
//        }
    }
    public static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }

}
