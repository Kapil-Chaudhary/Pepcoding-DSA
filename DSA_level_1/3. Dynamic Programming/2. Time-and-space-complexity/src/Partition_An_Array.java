/*

1. You are given an array(arr) of integers and a pivot.
2. You have to re-arrange the given array in such a way that all elements smaller or equal to pivot lie on the left side of pivot and all elements greater than pivot lie on its right side.
3. You have to achieve this in linear time.

Note -> For more information, watch question video.

Input Format
An Integer n
arr1
arr2..
n integers
An integer pivot


Output Format
Check the sample output and question video.


Constraints
1 <= N <= 100000
-10^9 <= arr[i] <= 10^9
-10^9 <= pivot <= 10^9


Sample Input
5
7
-2
4
1
3
3


Sample Output
Swapping -2 and 7
Swapping 1 and 7
Swapping 3 and 4
-2 1 3 7 4


 */


import java.util.Arrays;
import java.util.Scanner;
public class Partition_An_Array {
    public static void partition(int[] arr, int pivot){

        int i=0;
        int j=0;
        for ( int range=0; range<arr.length; range++ ){
            if ( arr[range]>pivot )i++;
            else swap(arr, i++, j++);
        }

//        System.out.println(Arrays.toString(arr));
//        System.out.println("i : " + i + "   || j : " + j);
    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
        int pivot = scn.nextInt();
        partition(arr,pivot);
        print(arr);
    }

}
