import java.util.*;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        ////method 1 --->>
//        int sp = num-1;
//        for ( int i=0; i<num; i++ ){
//            System.out.print("\t".repeat(sp) + "*\n");
//            sp--;
//        }

        // method 2  --->>
        for ( int i=num; i>=1; i-- ){
            for (int j=1; j<=num; j++){
                if ( i==j ) System.out.print("*");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}