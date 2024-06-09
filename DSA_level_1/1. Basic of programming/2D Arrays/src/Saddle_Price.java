/*

1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix.
2. You are required to find the saddle price of the given matrix and print the saddle price.
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
Input Format

A number n
--------------------
e11
e12..
e21
e22..
.. n * n number of elements of array a


Output Format
----------------------
Saddle point of the matrix if available or "Invalid input" if no saddle point is there.


Constraints
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9

Sample Input
---------------------
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44


Sample Output
------------------------
41


 */



//  question 1
//import java.util.Scanner;
//
//public class Saddle_Price{
//
//    public static void display(int[][] arr){
//        for ( int i=0; i<arr.length; i++) {
//            for ( int j=0; j<arr[0].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        // write your code here
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//
//        int[][] arr = new int[num][num];
//        for ( int i=0; i<num; i++){
//            for ( int j=0; j<num; j++){
//                arr[i][j] = scan.nextInt();
//            }
//        }
//
////        display(arr);
//
//        int saddle = -1;
//        for ( int row=0; row<num; row++){
//
//            int min = Integer.MAX_VALUE;
//            int c = -1;
//            for ( int column=0; column<num; column++ ){
//                if ( min>arr[row][column] ){
//                    min = arr[row][column];
//                }
//            }
//            for ( int column=0; column<arr[0].length; column++ ){
//                if ( min==arr[row][column] ){
//                    c = column;
//                }
//            }
////            System.out.println(min + " " + c);
//
//            int max = Integer.MIN_VALUE;
//            for ( int r=0; r<num; r++ ){
//                if ( arr[r][c]>max ){
//                    max = arr[r][c];
//                }
//            }
//
//            if ( min==max ){
//                saddle = min;
//                break;
//            }
//        }
//
//        if ( saddle==-1 ) System.out.println("Invalid input");
//        else System.out.println(saddle);
//
//    }
//}


// question 2
import java.util.Scanner;
public class Saddle_Price{

    public static void display(int[][] arr){
        for ( int i=0; i<arr.length; i++) {
            for ( int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int min_row_index(int[][] arr, int row){

        int min_c = 0;
        int min = arr[row][0];
        for ( int column=1; column<arr[0].length; column++ ){
            if ( min>arr[row][column] ){
                min = arr[row][column];
                min_c = column;
            }
        }
        return min_c;
    }

    public static int max_col_index(int[][] arr, int col){

        int max_r_index = 0;
        int max_row = arr[0][col];
        for ( int row=1; row<arr.length; row++ ){
            if ( max_row<arr[row][col] ){
                max_row = arr[row][row];
                max_r_index = row;
            }
        }
        return max_r_index;
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[][] arr = new int[num][num];
        for ( int i=0; i<num; i++){
            for ( int j=0; j<num; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        int saddle = -1;
        for ( int row=0; row<num; row++){
            int min_col_index = min_row_index(arr, row);
            int max_row_index = max_col_index(arr, min_col_index);

            if ( row==max_row_index ){
                System.out.println(arr[max_row_index][min_col_index]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}