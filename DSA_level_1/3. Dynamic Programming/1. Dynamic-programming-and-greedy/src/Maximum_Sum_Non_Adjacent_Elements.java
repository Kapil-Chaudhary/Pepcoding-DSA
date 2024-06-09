/*

        discription
---------------------------
1. You are given a number n, representing the count of elements.
2. You are given n numbers, representing n elements.
3. You are required to find the maximum sum of a subsequence with no adjacent elements.


Input Format
A number n
n1
n2
.. n number of elements

Output Format
A number representing the maximum sum of a subsequence with no adjacent elements.

Constraints
1 <= n <= 1000
-1000 <= n1, n2, .. n elements <= 1000



---- input ----
6
5
10
10
100
5
6


--- output -----
116

 */


import java.util.Scanner;
public class Maximum_Sum_Non_Adjacent_Elements {
    public static int Maximum_Sum_Non_Adjacent_Elements(int[] arr ){

        int inc = arr[0];
        int exc = 0;

        for ( int i=1; i<arr.length; i++ ){
            int new_inc = arr[i] + exc;
            int new_exc = Math.max(inc, exc);

            inc = new_inc;
            exc = new_exc;
        }
        return Math.max(inc,exc);
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int arr[] = new int[num];
        for ( int i=0; i<arr.length; i++ ) arr[i] = scan.nextInt();

        int ans = Maximum_Sum_Non_Adjacent_Elements(arr);
        System.out.println(ans);
    }
}

