import java.util.*;

//public class Pattern_5{
//    public static void main(String[] args) {
//        // write your code here
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//
//        int star = 1;
//        int space = num/2;
//        for ( int i=0; i<num/2; i++){
//            System.out.println("\t".repeat(space) + "*\t".repeat(star));
//            space--;
//            star+=2;
//        }
////        System.out.println("*\t".repeat(num));
//        for ( int i=0; i<=num/2; i++){
//            System.out.println("\t".repeat(space) + "*\t".repeat(star));
//            space++;
//            star-=2;
//        }
//    }
//
//}


public class Pattern_5{
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int star = 1;
        int space = num/2;
        for ( int i=0; i<num; i++ ){
//            System.out.println("\t".repeat(space) + "*\t".repeat(star));

            for ( int j=0; j<space; j++ ) System.out.print("\t");
            for ( int j=0; j<star; j++ ) System.out.print("*\t");
            System.out.println();

            if ( i<num/2){
                star += 2;
                space--;
            }
            else {
                star-=2;
                space++;
            }
        }
    }
}







/*

    *
  * * *
* * * * *
  * * *
    *


 */