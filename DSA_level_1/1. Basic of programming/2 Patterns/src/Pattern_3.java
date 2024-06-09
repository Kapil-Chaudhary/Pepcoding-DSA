import java.util.*;

public class Pattern_3{
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // method 1 --->
//        for ( int i=num; i>=1; i--){
//            System.out.println("\t".repeat(i-1)+"*\t".repeat(num-i+1));
//        }


        // method 2 --->
        for ( int i=1; i<=num; i++){
            for ( int j=num-1; j>=i; j--){
                System.out.print("\t");
            }
            for ( int k=1; k<=i; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

}