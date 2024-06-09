  //       question
/*

The historic state of Wakanda has various monuments and souveniers which are visited by many travellers every day. The guides follow a prescribed route of visiting the monuments which improves them understand the relevance of each monument. The route of the monument is fixed and expressed in a 2-d matrix where the travellers visit the prescribed next monument. For example
1  2  3
4  5  6
7  8  9
is the prescribed route and the visitors travels this path: 1->2->3->4->5->6->7->8->9
However, a certain visitor decides to travel a different path as follows:
1. The visitor only plans to visit the upper diagonal triangle of the monument list.
2. The visitor travels diagonally till there are no more moves left in the current journey.
3. He then visits the adjacent monument to the first monument of current diagonal journey.
4. He continues the same path till all the monuments of the upper half have been travelled.
For Example:
The monuments are named as:
1    2    3    4
5    6    7    8
9   10  11  12
13 14  15  16
The path followed by the visitor is: 1->6->11->16->2->7->12->3->8->4
You are required to print the path followed by the traveller to visit all the monuments.
Refer to the photo for a better clarification.
1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a.
3. You are required to diagonally traverse the upper half of the matrix and print the contents.
For details check image.

diagonal-traversal ( image )


Input Format
---------------------
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a


Output Format
-------------------------
Diagonal traversal as in image below


Constraints
----------------
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
11
22
33
44
12
23
34
13
24
14

 */


//   sol 1
//import java.util.Scanner;
//
//public class The_State_Of_Wakanda_2 {
//
//    public static void main(String[] args) throws Exception {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//
//        int[][] arr = new int[n][n];
//        for(int i=0; i<n; i++ ){
//            for(int j=0; j<n; j++){
//                arr[i][j] = scan.nextInt();
//            }
//        }
//
//        int c = 0;
//        while (c!=arr[0].length){
//
//            int row = 0;
//            int col = c;
//            while( row<arr.length -c) {
//                System.out.println(arr[row][col]);
//                row++;
//                col++;
//            }
//            row = 0;
//            c = c+1;
//            col = c;
//        }
//    }
//}

import java.util.Scanner;

public class The_State_Of_Wakanda_2{

    public static void display(int[][] arr){
        for ( int i=0; i<arr.length; i++) {
            for ( int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++ ){
            for(int j=0; j<n; j++){
                arr[i][j] = scan.nextInt();
            }
        }
//        display(arr);

        for ( int row=0; row< arr.length; row++){
            int temp = 0;
            for ( int col=row; col<arr[0].length; col++){
                System.out.println(arr[temp][col]);
                temp++;
            }
        }
    }
}