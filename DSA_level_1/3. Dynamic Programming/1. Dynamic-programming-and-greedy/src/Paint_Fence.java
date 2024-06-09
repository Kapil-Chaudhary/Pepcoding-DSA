/*

        discription
---------------------------
1. You are given a number n and a number k in separate lines, representing the number of fences and number of colors.
2. You are required to calculate and print the number of ways in which the fences could be painted so that not more than two consecutive  fences have same colors.


Input Format

A number n
A number k

Output Format
A number representing the number of ways in which the fences could be painted so that not more than two fences have same colors.

Constraints
1 <= n <= 10
1 <= k <= 10


---- input ----

8
3


--- output -----
3672

 */

import java.util.Scanner;
public class Paint_Fence {

    public static long  Paint_Fence(int n, int k) {
        if ( n==0 ) return 0;
        if (n == 1) return (long) k;

        // start from 2
        long mod = 1000000007;
        long last_2_is_same = k % mod;
        long last_2_is_diff = (k*(k-1)) % mod;
//        long total = last_2_is_same + last_2_is_diff;

        for ( int i=3; i<=n; i++ ){
            long prev = last_2_is_diff % mod;
            last_2_is_diff = ( (last_2_is_same + last_2_is_diff) * (k-1) ) % mod;
            last_2_is_same = prev % mod;

//            total = last_2_is_same + last_2_is_diff;
//            System.out.println(total);
        }
        return (last_2_is_same+last_2_is_diff) % mod ;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        long ans =  Paint_Fence(n, k);
        System.out.println(ans);
    }
}