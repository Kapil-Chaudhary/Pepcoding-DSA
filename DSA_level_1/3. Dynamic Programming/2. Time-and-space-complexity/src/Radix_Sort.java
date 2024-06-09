/*
1. You are given an array(arr) of integers.
2. You have to sort the given array in increasing order using radix sort.


Input Format
An Integer n
arr1
arr2..
n integers

Output Format
Check the sample ouput and question video.

Constraints
1 <= N <= 10000
0 <= arr[i] <= 10^8


Sample Input
5
7
2
4
1
3


Sample Output
After sorting on 1 place -> 1 2 3 4 7
1 2 3 4 7

 */


import java.util.Scanner;
public class Radix_Sort {

    public static void radixSort(int[] arr) {

        int max = Integer.MIN_VALUE;
        for ( int val : arr){
            if ( val>max ) max = val;
        }

        int exp = 1;
        while ( exp<=max ){
            countSort(arr, exp);
            exp = exp * 10;
        }

    }




    public static void countSort(int[] arr, int exp) {

        int[] freq = new int[10];
        for ( int i=0; i<arr.length; i++ ){
            freq[arr[i] / exp % 10]++;
        }

        for (int i=1; i<freq.length; i++ ){
            freq[i] = freq[i] + freq[i-1];
        }

        int[] ans = new int[arr.length];
        for ( int i=arr.length-1; i>=0; i-- ){
            int val = arr[i];
            int pos = freq[(val - 0) / exp % 10]; // 0 represent minimun
            ans[pos-1] = val;
            freq[(val - 0) / exp % 10]--;
        }

        for ( int i=0; i<arr.length; i++ ){
            arr[i] = ans[i];
        }

        System.out.print("After sorting on " + exp + " place -> ");
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }

}
