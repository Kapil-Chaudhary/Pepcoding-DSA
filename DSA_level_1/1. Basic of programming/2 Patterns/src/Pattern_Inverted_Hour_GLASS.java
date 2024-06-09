import java.util.Scanner;

public class Pattern_Inverted_Hour_GLASS {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int nst = num;
        int nsp = 0;
        for( int i=1; i<=num; i++ ){
            System.out.print("\t".repeat(nsp));

            for( int cst=1; cst<=nst; cst++ ){
                if ( ( i>num/2 && i<num )  && ( cst>1 && cst<nst )   ){
                    System.out.print("\t");
                }
                else System.out.print("*\t");
            }

            System.out.print("\t".repeat(nsp));

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
