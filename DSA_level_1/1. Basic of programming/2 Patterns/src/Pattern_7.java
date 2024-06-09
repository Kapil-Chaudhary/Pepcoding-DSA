import java.util.*;

public class Pattern_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int sp=0;
        for ( int i=0; i<num; i++ ){
            System.out.print("\t".repeat(sp) + "*");
            System.out.println();
            sp++;
        }
    }
}