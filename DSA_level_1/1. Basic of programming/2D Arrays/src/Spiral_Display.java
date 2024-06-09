/*

1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.


Input Format
-------------------
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements


Output Format
-------------------
e11
e21
..
en1
en2
en3
..
enm
e(n-1)m
..
e1m
e1(m-1)
..
e12
e22
e32
..


Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9


Sample Input
----------------------
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35


Sample Output
--------------------------------
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24



 */


import java.util.Scanner;

public class Spiral_Display {

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
        int m = scan.nextInt();

        int[][] arr = new int[n][m];
        for ( int i=0; i<arr.length; i++){
            for ( int j=0; j<arr[0].length; j++){
                arr[i][j] = scan.nextInt();
            }
        }
//        display(arr);

        int min_r = 0;
        int min_c = 0;
        int max_r = arr.length -1 ;
        int max_c = arr[0].length -1;

        int count = 0;
        int total = n*m;

        while( count<total ){

            //left wall
            for ( int j=min_c, i=min_r; (i<=max_r  && count<total); i++ ){
                System.out.println(arr[i][j]);
                count++;
            }
            min_c++;

            //bottom wall
            for ( int i=max_r, j=min_c; (j<=max_c  && count<total ); j++){
                System.out.println(arr[i][j]);
                count++;
            }
            max_r--;

            //right wall
            for ( int j=max_c, i=max_r; ( i>=min_r  && count<total ); i--){
                System.out.println(arr[i][j]);
                count++;
            }
            max_c--;

            //top wall
            for ( int i=min_r, j=max_c; ( j>=min_c  && count<total ); j--){
                System.out.println(arr[i][j]);
                count++;
            }
            min_r++;

        }
    }

}
















