import java.util.*;

public class Pattern_6{
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int star = num  - (num)/2;
        int space = 1;
        for ( int i=0; i<num; i++ ){
            System.out.println("*\t".repeat(star) + "\t".repeat(space) + "*\t".repeat(star));
            if ( i<num/2 ){
                space+=2;
                star--;
            }
            else {
                space-=2;
                star++;
            }
        }
    }
}