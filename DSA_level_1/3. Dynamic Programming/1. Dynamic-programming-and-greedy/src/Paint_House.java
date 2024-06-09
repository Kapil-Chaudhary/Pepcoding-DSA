/*

        discription
---------------------------
1. You are given a number n, representing the number of houses.
2. In the next n rows, you are given 3 space separated numbers representing the cost of painting nth house with red or blue or green color.
3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.


Input Format
A number n
n1red n1blue n1green
n2red n2blue n2green
.. n number of elements

Output Format
A number representing the minimum cost of painting all houses without painting any consecutive house with same color.

Constraints
1 <= n <= 1000
0 <= n1red, n1blue, .. <= 1000



---- input ----
4
1 5 7
5 8 4
3 2 9
1 2 4


--- output -----
8

 */

import java.util.Scanner;
public class Paint_House {

    public static long Paint_House(int[][] arr){

        for ( int i=1; i< arr.length; i++ ){
            for ( int j=0; j<arr[0].length; j++ ){
                if ( j==0 ) arr[i][j] = arr[i][j] +  Math.min(arr[i-1][1], arr[i-1][2]);
                else if ( j==1 ) arr[i][j] = arr[i][j] +  Math.min(arr[i-1][0], arr[i-1][2]);
                else if ( j==2 ) arr[i][j] = arr[i][j] +  Math.min(arr[i-1][0], arr[i-1][1]);

            }
        }

        int n = arr.length;
        long min_ans = Math.min(arr[n-1][0], Math.min(arr[n-1][1], arr[n-1][2]) );
        return min_ans;
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int arr[][] = new int[num][3];
        for ( int i=0; i<arr.length; i++ ) {
            for ( int j =0; j<arr[0].length; j++ ) {
                arr[i][j] = scan.nextInt();
            }
        }

        // print an array
//        for ( int i=0; i<arr.length; i++ ){
//            System.out.println(Arrays.toString(arr[i]));
//        }

        long ans = Paint_House(arr);
        System.out.println(ans);
    }
}

