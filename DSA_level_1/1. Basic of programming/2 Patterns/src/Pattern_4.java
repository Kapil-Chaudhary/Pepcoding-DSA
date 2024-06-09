import java.util.*;

public class Pattern_4 {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int space = 0;
        int star = num;
        for (int i=0; i<num; i++) {
            for ( int sp=0; sp<space; sp++) System.out.print("\t");
            space++;
            for ( int st=0; st<star; st++ ) System.out.print("*\t");
            star--;

            System.out.println();
        }
    }
}
// 0-5+5 = 0
// 1-5+5