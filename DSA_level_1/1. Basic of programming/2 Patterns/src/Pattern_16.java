import java.util.Scanner;

public class Pattern_16 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int nst = 1;
        int nsp = 2*num - 3;
        for ( int i=1; i<=num; i++ ){

            for ( int cst=1; cst<=nst; cst++ ){
                System.out.print(cst + "\t");
            }
            for ( int csp=1; csp<=nsp; csp++){
                System.out.print("\t");
            }

            if ( nst==num ){
                nst--;
            }

            for (int cst=nst; cst>=1; cst--){
                System.out.print(cst + "\t");
            }


            System.out.println();
            nsp-=2;
            nst++;
        }
    }
}

/*

1												1
1	2										2	1
1	2	3								3	2	1
1	2	3	4						4	3	2	1
1	2	3	4	5				5	4	3	2	1
1	2	3	4	5	6		6	5	4	3	2	1
1	2	3	4	5	6	7	6	5	4	3	2	1


 */

