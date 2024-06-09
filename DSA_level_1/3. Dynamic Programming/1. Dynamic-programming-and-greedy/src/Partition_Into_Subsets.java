/*

1. You are given a number n, representing the number of elements.
2. You are given a number k, representing the number of subsets.
3. You are required to print the number of ways in which these elements can be partitioned in k non-empty subsets.
E.g.
For n = 4 and k = 3 total ways is 6
12-3-4
1-23-4
13-2-4
14-2-3
1-24-3
1-2-34

Input Format
A number n
A number k

Output Format
A number representing the number of ways in which these elements can be partitioned in k non-empty subsets.



Constraints
0 <= n <= 20
0 <= k <= n



Sample Input
4
3


Sample Output
6


 */

import java.util.Scanner;
public class Partition_Into_Subsets {

    public static void display(long[][] arr){
        for ( int i=0; i<arr.length; i++ ){
            for ( int j=0; j<arr[0].length; j++ ){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static long partitionKSubset(int n, int k) {

        long[][] dp = new long[k+1][n+1];
        for ( int i=0; i<dp.length; i++ ){ // k ( team )
            for ( int j=0; j<dp[0].length; j++ ){  // n ( banda )

                if ( i==0 || j==0 ) dp[i][j] = 0;
                else if ( j<i ) dp[i][j] = 0;
                else if ( i==j ) dp[i][j] = 1;
                else {
                    dp[i][j] = i * dp[i][j-1] + dp[i-1][j-1];
                }
            }
        }
        display(dp);
        long ans = dp[dp.length-1][dp[0].length-1];
        return ans;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // 4
        int k = scn.nextInt(); // 3

        long res = partitionKSubset(n, k);
        System.out.println(res);
    }
}
