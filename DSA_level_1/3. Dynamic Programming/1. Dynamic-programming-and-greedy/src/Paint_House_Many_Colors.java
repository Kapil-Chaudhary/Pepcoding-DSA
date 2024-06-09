/*

        discription
---------------------------
1. You are given a number n and a number k separated by a space, representing the number of houses and number of colors.
2. In the next n rows, you are given k space separated numbers representing the cost of painting nth house with one of the k colors.
3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.


Input Format
A number n
n1-0th n1-1st n1-2nd .. n1-kth
n2-0th n2-1st n2-2nd .. n2-kth
.. n number of elements

Output Format
A number representing the minimum cost of painting all houses without painting any consecutive house with same color.

Constraints
1 <= n <= 1000
1 <= k <= 10
0 <= n1-0th, n1-1st, .. <= 1000


---- input ----

4 3
1 5 7
5 8 4
3 2 9
1 2 4


--- output -----
8

 */

import java.util.Arrays;
import java.util.Scanner;
public class Paint_House_Many_Colors {

    public static void print_2D_array(int[][] arr){
        //         print an array
        for ( int i=0; i<arr.length; i++ ){
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    public static int  Paint_House_Many_Colors(int[][] dp){


        int[] find_2_mins = dp[0];
        int first_min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for ( int i=0; i<find_2_mins.length; i++) {
            int element_at_idx = find_2_mins[i];

            if ( element_at_idx<first_min ) {
                second_min = first_min;
                first_min = element_at_idx;

            }
            else if ( element_at_idx>first_min && element_at_idx<second_min ) second_min = element_at_idx;
        }

//        System.out.println(first_min + "\n" + second_min);

        for( int i=1; i<dp.length; i++ ) {
            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;

            for (int j = 0; j < dp[0].length; j++) {
                if ( dp[i-1][j]==first_min ) {
                    dp[i][j] = dp[i][j] + second_min;
                }
                else  {
                    dp[i][j] = dp[i][j] + first_min;
                }

                if ( dp[i][j]<= nleast ){
                    nsleast = nleast;
                    nleast = dp[i][j];
                }
                else if ( dp[i][j] <= nsleast ){
                    nsleast = dp[i][j];
                }
            }
            first_min = nleast;
            second_min = nsleast;
        }

////         print dp
//        print_2D_array(dp);


//        System.out.println(Arrays.toString(dp[dp.length-1]));
        int ans_min = Integer.MAX_VALUE;
        for ( int i=0; i< dp[0].length; i++ ){
            if ( dp[dp.length-1][i]<ans_min ){
                ans_min = dp[dp.length-1][i];
            }
        }
        return  ans_min;
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] num = scan.nextLine().split(" ");

//        System.out.println(Arrays.toString(num));

        int n1 = Integer.parseInt(num[0]);
        int n2 = Integer.parseInt(num[1]);

        int arr[][] = new int[n1][n2];
        for ( int i=0; i<arr.length; i++ ) {
            for ( int j =0; j<arr[0].length; j++ ) {
                arr[i][j] = scan.nextInt();
            }
        }



        long ans =  Paint_House_Many_Colors(arr);
        System.out.println(ans);
    }
}



/*

solution 2

import java.util.Scanner;
public class Main{

    public static void display(int[][] arr){
        for ( int i=0; i<arr.length; i++ ){
            for ( int j=0; j<arr[0].length; j++ ){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMinimun(int[][] arr, int row, int col){
        int min = Integer.MAX_VALUE;
        for ( int i=0; i<arr[0].length; i++  ){
            if ( i==col) ;
            else min = Math.min( arr[row][i], min );
        }
        return min;
    }
    public static int printHouse(int[][] arr, int[][] dp ){
        for ( int i=0; i<dp.length; i++ ) {
            for (int j = 0; j < dp[0].length; j++) {

                if ( i==0 ) dp[i][j] = arr[i][j];
                else {
                    int min = findMinimun(dp, i-1, j);
                    dp[i][j] = arr[i][j] + min;
                }
            }
        }

//        display(dp);

        int min = Integer.MAX_VALUE;
        for ( int i=0; i<dp[0].length; i++ ){
            min = Math.min( min, dp[dp.length-1][i] );
        }
        return min;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();

        int[][] arr = new int[row][col];
        for ( int i=0; i<arr.length; i++ ){
            for ( int j=0; j<arr[0].length; j++) arr[i][j] = scan.nextInt();
        }

//        display(arr);
        int[][] dp = new int[arr.length][arr[0].length];

        int ans = printHouse(arr, dp);
        System.out.println(ans);
    }
}

 */