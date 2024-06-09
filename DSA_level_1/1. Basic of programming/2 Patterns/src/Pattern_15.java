//import java.util.Scanner;
//
//public class Pattern_15 {
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//
//        int nst = 1;
//        int nsp = num/2;
//        int count = 1;
//        int val=1;
//        for ( int i=1; i<=num; i++ ){
//
//            for ( int csp=1; csp<=nsp; csp++) System.out.print("\t");
//
//            int val2 = val;
//            for ( int cst=1; cst<=nst; cst++) {
//                System.out.print(val2 + "\t");
//                if ( cst<=count/2)  val2++;
//                else val2--;
//            }
//
////            for ( int csp=1; csp<=nsp; csp++) System.out.print("\t");
//
//            System.out.println();
//
//            if ( i <= num/2 ){
//              nsp--;
//              nst+=2;
//              count+=2;
//              val++;
//            }
//            else {
//                nsp++;
//                nst-=2;
//                count-=2;
//                val--;
//            }
//        }
//
//    }
//}
import java.util.*;

public class Pattern_15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        // write ur code here

        int nsp = num/2;
        int nst = 1;
        int val = 1;
        int count = 1;

        for ( int i=1; i<=num; i++){

            for ( int csp=1; csp<=nsp; csp++){
                System.out.print("\t");
            }

            int temp = val;
            for ( int cst=1; cst<=nst; cst++){
                System.out.print(temp + "\t");

                if ( cst<=nst/2 ) temp++;
                else temp--;

            }

            System.out.println();

            if ( i<=num/2 ){
                nsp--;
                nst+=2;
                val++;
            }
            else {
                nsp++;
                nst-=2;
                val--;
            }
        }
    }
}