import java.util.Scanner;

public class Patttern_19 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for ( int i=1; i<=num; i++){
            for (int j=1; j<=num; j++ ){

                if ( (i==num/2+1 || j==num/2+1)  || (i==1 || j==1) || (i==num || j==num) ) {

                    if (i==num/2+1 || j==num/2+1) System.out.print("*\t");
                    else if (  (i==1 && j<= num/2) || ( i==num && j>num/2+1)  ) System.out.print("*\t");
                    else if ( (j==1 && i>num/2+1) || ( j==num && i<=num/2) ) System.out.print("*\t");
                    else System.out.print("\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}

/*

 *	*   *	    *
 *	    *	    *
 *	*   *	*   *
 *      *       *
 *      *   *   *


 */
