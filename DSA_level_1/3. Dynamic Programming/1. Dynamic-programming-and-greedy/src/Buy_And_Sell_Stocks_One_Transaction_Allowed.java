/*

1. You are given a number n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. You are required to print the maximum profit you can make if you are allowed a single transaction.


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
17



 */

import java.util.Arrays;
import java.util.Scanner;
public class Buy_And_Sell_Stocks_One_Transaction_Allowed {

    public static int buy_And_Sell_Stocks_One_Transaction_Allowed(int[] arr){
        int min = arr[0];
        int maxDiff = 0;
        for ( int i=1; i<arr.length; i++ ){
            if ( arr[i]<min ){
                min = arr[i];
            }
            else {
                int max = arr[i];
                if ( (max - min) > maxDiff ){
                    maxDiff = max - min;
                }
            }
        }
        return maxDiff;
    }

    public static int buy_And_Sell_Stocks_One_Transaction_Allowed2(int[] arr){

        int lsf = Integer.MAX_VALUE;
        int pist = 0;
        int op = 0;
        for ( int i=0; i<arr.length; i++ ){
            if ( arr[i]<lsf ){
                lsf = arr[i];
            }
            pist = arr[i] - lsf;

            if ( op<pist ) {
                op = pist;
            }
        }
        return op;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) arr[i] = scan.nextInt();
        System.out.println(Arrays.toString(arr));

        int ans = buy_And_Sell_Stocks_One_Transaction_Allowed2(arr);
        System.out.println(ans);
    }
}