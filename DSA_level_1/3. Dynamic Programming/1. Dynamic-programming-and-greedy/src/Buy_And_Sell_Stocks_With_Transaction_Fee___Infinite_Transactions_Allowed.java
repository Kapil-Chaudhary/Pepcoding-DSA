/*

1. You are given a number n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. You are give a number fee, representing the transaction fee for every transaction.
4. You are required to print the maximum profit you can make if you are allowed infinite transactions, but has to pay "fee" for every closed transaction.
Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).


Input Format
A number n
.. n more elements
A number fee


Output Format
A number representing the maximum profit you can make if you are allowed infinite transactions with transaction fee.


Constraints
0 <= n <= 20
0 <= n1, n2, .. <= 10
0 <= fee <= 5


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
3


Sample Output
13




 */


import java.util.Scanner;
public class Buy_And_Sell_Stocks_With_Transaction_Fee___Infinite_Transactions_Allowed {

    public static int buy_And_Sell_Stocks_With_Transaction_Fee___Infinite_Transactions_Allowed(int[] arr, int tax){

        int bsp = -arr[0];
        int ssp = 0;

//        System.out.println("bsp : " + bsp  + "   ||   ssp : " + ssp);
        for ( int i=1; i<arr.length; i++ ){

            int prevBuy = bsp;

            // buy part
            int buyAtThisDay = ssp - arr[i] ;
//            System.out.println("buyAtThisDay : " + buyAtThisDay);
            bsp = Math.max( bsp, buyAtThisDay );

            // sell part
            int sellAtThisDay = arr[i] + prevBuy - tax;
            ssp = Math.max( ssp, sellAtThisDay );
        }

//        System.out.println("bsp : " + bsp  + "   ||   ssp : " + ssp);

        return Math.max(bsp, ssp);
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int range = scan.nextInt();
        int[] arr = new int[range];
        for (int i = 0; i < arr.length; i++) arr[i] = scan.nextInt();
//        System.out.println(Arrays.toString(arr));

        int num = scan.nextInt();
        int ans = buy_And_Sell_Stocks_With_Transaction_Fee___Infinite_Transactions_Allowed(arr, num);
        System.out.println(ans);

    }
}
