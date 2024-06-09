// jis main duplicacy allow nhi thi jaise ki target sum subset vala problem usme 2d array use kia tha
// jis main duplicacy allow thi jaise ki coin change vala problem usme 1d array use kia tha

import java.util.Arrays;
import java.util.Scanner;

public class Unbounded_Knapsack {

    public static int UnboundedKnapsacks(int[] amount, int[] weight, int sum){

        int[] dp = new int[sum+1];
        for ( int i=0; i<dp.length; i++ ){
            for ( int j=0; j<weight.length; j++ ){
                if ( i==0 ) ;
                else if ( weight[j]>i ) ;
                else dp[i] = Math.max(dp[i], amount[j] + dp[i - weight[j]] );
            }
            System.out.println(Arrays.toString(dp));
        }
//        System.out.println(Arrays.toString(dp));
        return dp[dp.length-1];

    }

    public static int unboundedKnapsack(int[] arr, int[] value, int amount){

        // dp is created here
        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for ( int i=1; i<dp.length; i++ ){
            int curr_value = 0;
            for ( int j=0; j<arr.length; j++ ){
                if ( i >= arr[j] ){

                    int val1 = value[j]; // 2
                    int val2 = dp[i-arr[j]];

                    if ( (val1+val2) > curr_value ) {
                        curr_value = val1+val2;
                        dp[i] = curr_value;
                    }
                }
            }
        }
//        System.out.println(Arrays.toString(dp));
        return dp[amount];
    }


    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] value = new int[num];
        int[] arr = new int[num];
        for (int i=0; i<arr.length; i++ ) value[i] = scan.nextInt();
        for ( int i=0; i<value.length; i++) arr[i] = scan.nextInt();

        int amount = scan.nextInt();

        int ans = unboundedKnapsack(arr, value, amount);
        System.out.println(ans);
    }
}

/*

---  input -----
5
15 14 10 45 30
2 5 1 3 4
7

---- output  -----
100

 */