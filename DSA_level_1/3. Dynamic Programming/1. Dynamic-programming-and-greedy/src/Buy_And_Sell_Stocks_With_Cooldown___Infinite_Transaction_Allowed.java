/*

1. You are given a number n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. You are required to print the maximum profit you can make if you are allowed infinite transactions, but have to cooldown for 1 day after 1 transaction
i.e. you cannot buy on the next day after you sell, you have to cooldown for a day at-least before buying again.
Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).


Input Format
A number n
.. n more elements


Output Format
A number representing the maximum profit you can make if you are allowed infinite transactions with cooldown of 1 day.


Constraints
0 <= n <= 20
0 <= n1, n2, .. <= 10


Sample Input
12
10
15
17
20
16
18
22
20
22
20
23
25


Sample Output
19


 */

import java.util.Arrays;
import java.util.Scanner;
public class Buy_And_Sell_Stocks_With_Cooldown___Infinite_Transaction_Allowed {

    public static int buy_And_Sell_Stocks_With_Cooldown___Infinite_Transaction_Allowed(int[] arr){

        int bsp = - arr[0];
        int ssp = 0;
        int csp = 0;
        for ( int i=1; i<arr.length; i++ ){

            int prevBuy = bsp;
            // buy at this point
            bsp = Math.max( bsp,  (csp - arr[i]) );

            int prevSell = ssp;
            // sell at this point
            ssp = Math.max( ssp, ( arr[i] + prevBuy ) );

            // cool at this point
            csp = Math.max( prevSell, csp );
        }

//        System.out.println("bsp : " + bsp + "   || ssp : " + ssp + "   || csp : " + csp);
        return ssp;
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) arr[i] = scan.nextInt();
//        System.out.println(Arrays.toString(arr));

        int ans = buy_And_Sell_Stocks_With_Cooldown___Infinite_Transaction_Allowed(arr);
        System.out.println(ans);

    }
}