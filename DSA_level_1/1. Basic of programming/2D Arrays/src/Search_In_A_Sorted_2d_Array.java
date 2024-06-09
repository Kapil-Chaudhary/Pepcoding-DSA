/*

1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a.
Note - Each row and column is sorted in increasing order.
3. You are given a number x.
4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
5. In case element is not found, print "Not Found".


Input Format
------------------------
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
A number x


Output Format
----------------------------
row
col of the location where element is found or "Not Found" if element is not in the matrix


Constraints
-----------------------
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
All rows and columns are sorted in increasing order

Sample Input
------------------------
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
43


Sample Output
--------------------------
3
2



 */


// solution 1
//import java.util.Scanner;
//
//public class Search_In_A_Sorted_2d_Array {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n1 = scn.nextInt();
//
//        int[][] arr1 = new int[n1][n1];
//        for (int i = 0; i < n1; i++) {
//            for (int j = 0; j < n1; j++) {
//                arr1[i][j] = scn.nextInt();
//            }
//        }
//
//        int ele = scn.nextInt();
//
////        System.out.println();
////        for ( int i=0; i<arr1.length; i++){
////            for ( int j=0; j<arr1[0].length; j++){
////                System.out.print(arr1[i][j] + " ");
////            }
////            System.out.println();
////        }
//
//        int r = -1;
//        int c = -1;
//        for ( int row=0; row<n1; row++){
//            for ( int col=n1-1; col>=0; col--){
//
//                if ( arr1[row][col]<ele ) break;
//
//                if ( arr1[row][col]==ele ) {
//                    r = row;
//                    c = col;
//                }
//            }
//        }
//        if ( r==-1 || c==-1 ) System.out.print("Not Found");
//        else System.out.print(r +"\n"+ c);
//    }
//}



//  solution 2
import java.util.Scanner;
public class Search_In_A_Sorted_2d_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        int[][] arr1 = new int[n1][n1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }
        //find element
        int ele = scn.nextInt();

        int i = 0;
        int j = arr1[0].length-1;
        while ( i<arr1.length && j>=0 ){
            if ( arr1[i][j]<ele ){
                i++;
            }
            else if ( arr1[i][j]>ele ){
                j--;
            }
            else{
                System.out.println(i + "\n" + j);
                return;
            }
            System.out.println("Not Found");
        }
    }
}
