/*

1. You are given a number n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. You are required to print the maximum profit you can make if you are allowed two transactions at-most.
Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).


Input Format
A number n
.. n more elements


Output Format
A number representing the maximum profit you can make if you are allowed a single transaction.


Constraints
0 <= n <= 20
0 <= n1, n2, .. <= 10


Sample Input
9
11
6
7
19
4
1
6
18
4

Sample Output
30


 */

import java.util.Arrays;
import java.util.Scanner;
public class Buy_And_Sell_Stocks___Two_Transactions_Allowed {

    public static int[]  buy_And_Sell_Stocks_Two_Transaction_Allowed_RightToLeft(int[] arr){
        int[] dp = new int[arr.length];

        int sell = arr[0];
        int profit = 0;
        for ( int i=1; i<arr.length; i++ ){

            int diff = arr[i] - sell;
            if ( diff > 0 ){
                if ( diff>profit ) profit = diff;
            }
            else {
                sell = arr[i];
            }

            if ( profit>dp[i-1] ) dp[i] = profit;
            else dp[i] = dp[i-1];
//            System.out.println("ele : " + arr[i] +  "    ||  sell : " + sell +  "    ||  diff : " + diff + "    || profit : " + profit);
        }
        return dp;

    }

    public static int[] buy_And_Sell_Stocks_Two_Transaction_Allowed_LeftToRight(int[] arr){
        int[] dp = new int[arr.length];

        int buy = 0;
        int max = arr[arr.length-1];
        int profit = 0;

//        System.out.println("buy : " + buy + "    ||  max : " + max + "    || profit : " + profit);
        for ( int i=arr.length-2; i>=0; i-- ){
            if ( i==arr.length-1 ){
                buy = 0;
                max = arr[arr.length-1];
                profit = 0;
            }
            else {
                int dif = max - arr[i];
                if ( dif>=0 ){
                    if ( profit<dif ) profit = dif;
                }
                else {
                    max = arr[i];
                }
            }

            if ( profit>dp[i+1] ) dp[i] = profit;
            else dp[i] = dp[i+1];
//            System.out.println("buy : " + arr[i] + "    ||  max : " + max + "    || profit : " + profit);
        }
        return dp;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) arr[i] = scan.nextInt();
//        System.out.println(Arrays.toString(arr));

        int[] rightToLeft = buy_And_Sell_Stocks_Two_Transaction_Allowed_RightToLeft(arr);
        int[] leftToRight = buy_And_Sell_Stocks_Two_Transaction_Allowed_LeftToRight(arr);


//        System.out.println( Arrays.toString(leftToRight) );
//        System.out.println( Arrays.toString(rightToLeft));

        int maxProfit = Integer.MIN_VALUE;
        for ( int i=0; i<leftToRight.length; i++ ){

//            System.out.println( "left i : " + leftToRight[i]);
//            System.out.println( "right i : " + rightToLeft[i]);

            int add = leftToRight[i] + rightToLeft[i];
            if ( add>maxProfit ) maxProfit= add;
        }
        System.out.println(maxProfit);
//        System.out.println( Arrays.toString(rightToLeft) + "\n" + Arrays.toString(leftToRight));
//        System.out.println(rightToLeft + rightToLeft);
    }
}

/*

19
30
40
43
50
45
20
26
40
80
50
30
15
10
20
40
45
71
50
55

 */