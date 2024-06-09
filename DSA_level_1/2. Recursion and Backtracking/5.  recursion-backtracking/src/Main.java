import java.lang.*;
import java.util.*;

public class Main {
    public static void printPattern(int num){

        for ( int i=1; i<=num; i++ ){
            System.out.print("*");
            for ( int j=0; j<num-2; j++ ) System.out.print(" ");
            System.out.println("*");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printPattern(num);
    }
}