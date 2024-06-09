import java.util.Scanner;

public class Pattern_M {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int nst = num;
        int nsp = 0;
        for( int i=1; i<=num; i++ ){
            for ( int cst=1; cst<=nst; cst++ ){
                if ( cst==1 || cst==num ) System.out.print("*\t");
                else if ( i<=num/2+1 &&  ( cst+i==num+1 || cst==i) ) System.out.print("*\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}
