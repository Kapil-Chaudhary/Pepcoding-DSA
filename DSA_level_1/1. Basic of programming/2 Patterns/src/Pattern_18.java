//import java.util.Scanner;
//
//public class Pattern_18 {
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//
//        int nsp = 0;
//        int nsp_r = (num)-4;
//
//        for ( int i=1; i<=num; i++){
//            if ( i==1 || i==num  ) System.out.print("*\t".repeat(num));
//            else if ( i<=num/2 ){
//                System.out.print("\t".repeat(nsp));
//                System.out.print("*\t");
//                System.out.print("[]\t".repeat(nsp_r));  // remove [] to ""  in answer
//                System.out.print("*\t");
//            }
//            else if ( i > num/2 ){
//                System.out.print("\t".repeat(nsp));
//                System.out.print("*\t".repeat(nsp_r));
//            }
//
//
//
//            System.out.println();
//
//            if( i==1 ) nsp++;
//            else if( i<num/2 ) {
//                nsp_r -= 2;
//                nsp++;
//            }
//            else if ( i==num/2){
//                nsp++;
//                nsp_r=1;
//            }
//            else if ( i>num/2) {
//                nsp--;
//                nsp_r+=2;
//            }
//        }
//    }
//}


import java.util.Scanner;

public class Pattern_18 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int nst = num;
        int nsp = 0;
        for( int i=1; i<=num; i++ ){
            System.out.print("\t".repeat(nsp));

            for( int cst=1; cst<=nst; cst++ ){
                if ( ( i>1 && i<=num/2 )  && ( cst>1 && cst<nst )   ){
                    System.out.print("\t");
                }
                else System.out.print("*\t");
            }

            System.out.println();

            if ( i<=num/2 ){
                nsp++;
                nst-=2;
            }
            else {
                nsp--;
                nst+=2;
            }
        }
    }
}


/*

 *	*	*	*	*	*	*
    *				*
         *		*
            *
         *	*	*
    *	*	*	*	*
 *	*	*	*	*	*	*



 */
