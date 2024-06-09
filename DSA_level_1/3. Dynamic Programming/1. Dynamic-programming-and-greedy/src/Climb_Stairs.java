/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. In one move, you are allowed to climb 1, 2 or 3 stairs.
4. You are required to print the number of different paths via which you can climb to the top.


Input Format
A number n


Output Format
A number representing the number of ways to climb the stairs from 0 to top.


Constraints
0 <= n <= 20


Sample Input
4


Sample Output
7


 */



import java.util.Scanner;
public class Climb_Stairs {

    public static int stairCount(int num){
        if ( num==0 ) return 1;
        else if ( num<0 ) return 0;

        int stCount1 = stairCount(num-1);
        int stCount2 = stairCount(num-2);
        int stCount3 = stairCount(num-3);

        int totalCount = stCount1 + stCount2 + stCount3 ;
        return totalCount;
    }

    //---------------     By Dynamic Programming  ---------------

    public static int stairCountMemoized(int num, int[] qb){  // qb is question bank
        if ( num==0 ) return 1;
        else if ( num<0 ) return 0;

        if ( qb[num]!=0 ) return qb[num];

        int stCount1 = stairCountMemoized(num-1, qb);
        int stCount2 = stairCountMemoized(num-2, qb);
        int stCount3 = stairCountMemoized(num-3, qb);

        int totalCount = stCount1 + stCount2 + stCount3 ;
        qb[num] = totalCount;
        return totalCount;
    }


    // -------         Dynamic Programming using Tabulation      ---------
    public static int countPathsTabulation(int n){
        // ism recursion nhi lagate isme iteration se solve karte hai
        int[] dp = new int[n+1];

        dp[0] = 1;
        for ( int i=1; i<=n; i++ ){
            if ( i==1 ){
                dp[i] = dp[i-1];
            }
            else if ( i==2 ){
                dp[i] = dp[i-1] + dp[i-2];
            }
            else {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        return dp[n];
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

//        int countStairs = stairCount(num);
//        System.out.println(countStairs);

//        int countStairMemoized = stairCountMemoized(num, new int[num+1]);
//        System.out.println(countStairMemoized);

        int countStairPathUsingTabulation = countPathsTabulation(num);
        System.out.println(countStairPathUsingTabulation);
    }
}




/*

import java.io.*;
import java.util.*;

public class Main {


    public static int totalCount(int num, String ans){
        System.out.println("count --> " + num + " : " + Arrays.toString(dp));
        if ( num<0 ) return 0;
        if ( num==0 ) return 1;
        if ( dp[num]!=0 ) return dp[num];

        int path1 = totalCount(num-1, ans);
        int path2 = totalCount(num-2, ans);
        int path3 = totalCount(num-3, ans);

        int total = path1+path2+path3;
        dp[num] = total;
        return total;

    }

    static int[] dp;
    public static int climbStairs(int num ){
        dp = new int[num+1];

        int totalCount = totalCount(num, "");
        System.out.println(Arrays.toString(dp));
        return totalCount;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);


        int ans = climbStairs(4);
        System.out.println(ans);
    }

}


 */
