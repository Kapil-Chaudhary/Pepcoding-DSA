//import java.util.Scanner;
//
//public class Pattern_9 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//
//        int star_right = num;
//        int star_left = 1;
//
//        for ( int i=0; i<num; i++ ){
//            for ( int j=1; j<=num; j++ ){
//                if ( j==star_left || j==star_right ){
//                    System.out.print("*\t");
//                }
//                else System.out.print("\t");
//            }
//            star_right--;
//            star_left++;
//            System.out.println();
//        }
//    }
//}


import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for ( int i=1; i<=num; i++){
            for ( int j=1; j<=num; j++){
                if ( i==j || i+j==num+1 ) System.out.print("*\t");
                else System.out.print("\t");
//                System.out.println();
            }
            System.out.println();
        }
    }
}




/*

 *				*
    *		*
        *
    *		*
 *				*

 */