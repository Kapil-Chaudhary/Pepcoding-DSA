/*

1. You are given a number n.
2. You are required to print the number of binary strings of length n with no consecutive 0's.


Input Format
A number n


Output Format
A number representing the number of binary strings of length n with no consecutive 0's.


Constraints
0 < n <= 45

Sample Input
6

Sample Output
21

 */


import java.util.Scanner;
public class Count_Binary_Strings {

    public static int countBinaryString_method1(int n ){
        int[] dpz = new int[n+1];
        int[] dp1 = new int[n+1];

        dpz[0] = 0;
        dpz[1] = 1;

        dp1[0] = 0;
        dp1[1] = 1;

        for ( int i=2; i<dpz.length; i++ ){
            dp1[i] = dp1[i-1] + dpz[i-1];
            dpz[i] = dp1[i-1];
        }
//        System.out.println(dpz[n] + dp1[n]);
        return dpz[n]+dp1[n];
    }

    public static int countBinaryString_method2(int n ){

        int oldCountZeros = 1;
        int oldCountOnes = 1;

        for ( int i=2; i<=n; i++ ){
            int newCountZeros = oldCountOnes;
            int newCountOnes = oldCountOnes + oldCountZeros;

            oldCountOnes = newCountOnes;
            oldCountZeros = newCountZeros;
        }

        int ans = oldCountOnes + oldCountZeros;
        return ans;

    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ans = countBinaryString_method1(n);
        int ans1 = countBinaryString_method2(n);

//        System.out.println(ans);
        System.out.println(ans1);
    }
}

/*

        discription
---------------------------
1. You are given a number n.
2. You are required to print the number of binary strings of length n with no consecutive 0's.

Input Format
A number n
Output Format
A number representing the number of binary strings of length n with no consecutive 0's.

---- input ----
6

--- output -----
21

 */