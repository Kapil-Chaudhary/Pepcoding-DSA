/*

1. You are given a number n, representing the count of items.
2. You are given n numbers, representing the values of n items.
3. You are given n numbers, representing the weights of n items.
3. You are given a number "cap", which is the capacity of a bag you've.
4. You are required to calculate and print the maximum value that can be created in the bag without
     overflowing it's capacity.

Note -> Each item can be taken 0 or 1 number of times. You are not allowed to put the same item
               again and again.


Input Format
A number n
v1 v2 .. n number of elements
w1 w2 .. n number of elements
A number cap



Output Format
A number representing the maximum value that can be created in the bag without overflowing it's capacity


Constraints
1 <= n <= 20
0 <= v1, v2, .. n elements <= 50
0 < w1, w2, .. n elements <= 10
0 < cap <= 10


Sample Input
5
15 14 10 45 30
2 5 1 3 4
7


Sample Output
75


 */


// solution 1   ------------------- >>>    Using Recursion
// recursion approach for 0-1 knapsack problem
//import java.util.*;
//public class Zero_One_Knapsack {
//
//    static int max(int a, int b)  {
//        return (a > b) ? a : b;
//    }
//
//    public static int knapSack(int cap, int[] weight, int[] price, int n){
//
//        if ( n==0 || cap==0 ){
//            return 0;
//        }
//
//        if ( weight[n-1]>cap ){
//            return knapSack(cap, weight, price, n-1);
//        }
//        else  { //else if (price[n-1]>cap)
//            return Math.max( (price[n-1] + knapSack(cap-weight[n-1], weight, price, n-1 )), knapSack(cap, weight, price, n-1));
//        }
//    }
//
//
//    public static void main(String args[])
//    {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int [] weight = new int[n];
//        int [] price = new int[n];
//
//        for (int i = 0; i < n; i++) price[i] = scn.nextInt();
//        for (int i = 0; i < n; i++) weight[i] = scn.nextInt();
//        int cap = scn.nextInt();
//
//        int k = knapSack(cap, weight, price, n);
//        System.out.println(k);
//    }
//}



import java.util.Scanner;
public class Zero_One_Knapsack {

    public  static int ZeroOneKnapsack(int[] arr, int[] value, int amount){

        int col = amount+1;
        int row = arr.length+1;
        int[][] dp = new int[row][col];

        for ( int i=0; i<dp.length; i++){
            for ( int j=0; j<dp[0].length; j++ ){

                if ( i==0 || j==0 ){
                    dp[i][j] = 0;
                }
                else{
                    int upper_max_value = dp[i-1][j];
                    int val = arr[i-1];
                    //int value = hMap.get(val);

                    if ( j>=val ){
                        int num = arr[i-1];
                        int req_num = j - num;
                        int curr_max = dp[i-1][req_num] + value[i-1];

                        if ( curr_max>upper_max_value ){
                            dp[i][j] = curr_max;
                        }
                        else{
                            dp[i][j] = upper_max_value;
                        }
                    }
                    else{
//                        int upper_max_value = dp[i-1][j];
                        dp[i][j] = upper_max_value;
                    }
                }
            }
        }

        // System.out.println(dp);
        int ans = dp[arr.length][amount];
        return ans;
    }



    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int[] value = new int[num];
        for ( int i=0; i<value.length; i++){
            value[i] = scan.nextInt();
        }

        int[] arr = new int[num];
        for ( int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        int amount = scan.nextInt();

        System.out.println(ZeroOneKnapsack(arr, value, amount));
    }
}




/*

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int maxSum;

    public static void Zero1KnapSack(int[] amount, int[] weight, int index, String ans, int count, int sum, int wSum){
        if ( index==weight.length ){
            if ( count==sum ) {
                System.out.println(ans);
                if ( wSum>maxSum ) {
                    maxSum = wSum;
                    System.out.println("maxSum : " + maxSum);

                }
            }
            return;
        }
        if ( count>sum ) return;
        System.out.println("index : " + index);
        Zero1KnapSack(amount, weight, index+1, ans, count, sum, wSum);
        Zero1KnapSack(amount, weight, index+1, ans + amount[index] + ", ", count+weight[index], sum, wSum+amount[index] );
    }

    public static int Zero_One_Knapsack(int[] amount, int[] weight, int sum){
        Zero1KnapSack(amount, weight, 0, "", 0, sum, 0);
        return maxSum;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int[] amount = new int[num];
        for ( int i=0; i<amount.length; i++ ) amount[i] = scan.nextInt();

        int[] weight = new int[num];
        for ( int i=0; i<weight.length; i++ ) weight[i] = scan.nextInt();

        int sum = scan.nextInt();

        int ans = Zero_One_Knapsack(amount, weight, sum);
        System.out.println(ans);

    }
}

//1 2 2 3

//        5
//        15 14 10 45 30
//        2 5 1 3 4
//        7
//
//        5
//        15 14 10 45 30
//        2 5 1 3 4
//        11

 */