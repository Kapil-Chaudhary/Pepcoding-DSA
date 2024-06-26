/*

1. You are given a number n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. You are required to print the maximum profit you can make if you are allowed infinite transactions.
Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy)


Input Format
A number n
.. n more elements


Output Format
A number representing the maximum profit you can make if you are allowed infinite transactions.


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


import java.util.Scanner;
import java.util.Arrays;
public class Buy_And_Sell_Stocks__Infinite_Transactions_Allowed {

    public static int buy_And_Sell_Stocks__Infinite_Transactions_Allowed(int[] arr){

        int buyDate = 0;
        int sellDate = 0;
        int profit = 0;
        for ( int i=1; i<arr.length; i++ ){

            if ( arr[i]>=arr[i-1] ){
                sellDate += 1;
            }else {
                profit += arr[sellDate] - arr[buyDate];
                buyDate = sellDate = i;
            }
        }
        profit += arr[sellDate] - arr[buyDate];
        return profit;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) arr[i] = scan.nextInt();
//        System.out.println(Arrays.toString(arr));

        int ans = buy_And_Sell_Stocks__Infinite_Transactions_Allowed(arr);
        System.out.println(ans);
    }
}
