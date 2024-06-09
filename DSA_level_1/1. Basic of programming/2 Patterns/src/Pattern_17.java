import java.util.Scanner;

public class Pattern_17 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int nst=1;
        for ( int i=1; i<=num; i++){

            if ( i == num/2+1 ) System.out.print("*\t".repeat(num/2));
            else System.out.print("\t".repeat(num/2));

            for ( int cst=1; cst<=nst; cst++ ){
                System.out.print("*\t");
            }
            System.out.println();

            if ( i < num/2+1 ) {
                nst++;
            }
            else {
                nst--;
            }
        }
    }
}

/*

         *
         *	*
*   *    *	*	*
         *	*
         *

 */

