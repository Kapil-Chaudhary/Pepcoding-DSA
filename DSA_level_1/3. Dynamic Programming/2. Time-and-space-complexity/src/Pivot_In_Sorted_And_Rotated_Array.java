/*

1. You are given an array(arr) of distinct integers, which is sorted and rotated around an unknown point.
2. You have to find the smallest element in O(logN) time-complexity


Input Format
An Integer N
arr1
arr2..
n integers


Output Format
The smallest element


Constraints
1 <= N <= 10000
-10^9 <= arr[i] <= 10^9


Sample Input
9
15
16
19
21
23
24
1
2
12


Sample Output
1


 */

import java.util.Scanner;
public class Pivot_In_Sorted_And_Rotated_Array {
    public static int findPivot(int[] arr) {

        int lo = 0;
        int hi = arr.length-1;
        while ( lo<hi ){
            int mid = (lo + hi) / 2;
            if ( arr[mid] < arr[hi] )hi = mid;
            else lo = mid+1;
        }
        return arr[lo];

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int pivot = findPivot(arr);
        System.out.println(pivot);
    }

}
