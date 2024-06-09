/*

1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you
     could jump to in a single move.
     You can of course jump fewer number of steps in the move.
4. You are required to print the number of different paths via which you can climb to the top.


Input Format
A number n
.. n more elements


Output Format
A number representing the number of ways to climb the stairs from 0 to top.


Constraints
0 <= n <= 20
0 <= n1, n2, .. <= 20



Sample Input
10
3
3
0
2
1
2
4
2
0
0


Sample Output
5


 */


import java.util.Scanner;

public class Climb_Stairs_With_Variable_Jumps {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for ( int i=0; i<arr.length; i++ ) arr[i] = scan.nextInt();

        int[] dp = new int[num + 1];
        dp[num] = 1;

        for ( int i=num-1; i>=0; i-- ){
            for ( int j=1; j<=arr[i] && i+j<dp.length; j++ ){
                dp[i] += dp[i + j];
            }
        }

        System.out.println(dp[0]);
    }
}
