/*

        discription
---------------------------
1. You are given a number n representing the length of a floor space which is 2m wide. It's a 2 * n board.
2. You've an infinite supply of 2 * 1 tiles.
3. You are required to calculate and print the number of ways floor can be tiled using tiles.


Input Format
A number n

Output Format
A number representing the number of ways in which the number of ways floor can be tiled using tiles.

Constraints
1 <= n <= 100


---- input ----
8



--- output -----
34

 */


import java.util.Scanner;

public class Tiling_With_2_multiply_1_Tiles {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] dp = new int[num+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for ( int i=3; i<dp.length; i++ ){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[num]);
    }
}
