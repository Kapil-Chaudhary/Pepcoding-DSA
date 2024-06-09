/*

1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number "tar".
4. You are required to calculate and print true or false, if there is a subset the elements of which add
     up to "tar" or not.


Input Format
A number n
n1
n2
.. n number of elements
A number tar


Output Format
true or false as required


Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 20
0 <= tar <= 50


Sample Input
5
4
2
7
1
3
10


Sample Output
true

 */

import java.util.Scanner;

public class Target_Sum_Subsets_Dp {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int arr[] = new int[num];
        for ( int i=0; i<arr.length; i++ ){
            arr[i] = scan.nextInt();
        }

        int target = scan.nextInt();

        boolean[][] dp = new boolean[arr.length+1][target+1];

        for ( int i=0; i<dp.length; i++ ){
            for ( int j=0; j<dp[0].length; j++ ){

                if ( i==0 && j==0 )dp[i][j]=true;

                else if ( i==0 )dp[i][j]=false;

                else if ( j==0 ) dp[i][j]=true;


                else{
                    if ( dp[i-1][j]==true ){
                        dp[i][j]=true;
                    }
                    else{
                        int val = arr[i-1];
                        if ( j >= val ){
                            if (dp[i-1][j-val]==true) {   //// if (dp[i][j-val]==true) {}     why ??
                                dp[i][j] = true;
                            }
                        }
                        else{
                            dp[i][j]=false;
                        }
                    }
                }
            }
//            System.out.println(dp[arr.length][target]);
        }

        System.out.println(dp[arr.length][target]);
    }
}

/*
14
        4
        6
        0
        18
        12
        4
        17
        5
        5
        4
        17
        1
        20
        14
3
 */