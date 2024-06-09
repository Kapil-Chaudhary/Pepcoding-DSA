/*

1. You are given a number n and a number m separated by line-break representing the length and breadth of a m * n floor.
2. You've an infinite supply of m * 1 tiles.
3. You are required to calculate and print the number of ways floor can be tiled using tiles.


Input Format
A number n
A number m


Output Format
A number representing the number of ways in which the number of ways floor can be tiled using tiles.

Constraints
1 <= n <= 100
1 <= m <= 50


Sample Input
39
16

Sample Output
61

 */

import java.util.Scanner;
public class Tiling_With_M_multiply_1_Tiles {

    public static int tailingFilling(int n, int m){
        int[] dp = new int[n+1];
        dp[0] = 0;
        for( int i=1; i<dp.length; i++ ){
            if ( i<m ){
                dp[i] = 1;
            }
            else if ( i==m ){
                dp[i] = 2;
            }
            else{
                dp[i] = dp[i-1] + dp[i-m];
            }
        }
        return dp[dp.length-1];
    }



    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int ans = tailingFilling( n, m);
        System.out.println(ans);

    }
}