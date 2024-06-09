/*

1. You are given an array(arr) of different dates in format DD-MM-YYYY.
2. You have to sort these dates in increasing order.


Input Format
An Integer N
arr1
arr2..
n integers


Output Format
Check the sample output and question video.


Constraints
1 <= N <= 10000
All dates are between year 0 to year 2500


Sample Input
5
12041996
20101996
05061997
12041989
11081987


Sample Output
11081987
12041989
12041996
20101996
05061997


 */

import java.util.Scanner;
public class Sort_Dates {
    public static void sortDates(String[] arr) {

        countSort(arr, 1000000, 100, 32 ); // days
        countSort(arr, 10000, 100, 13); // months
        countSort(arr, 1, 10000, 2501); // years
    }

    public static void countSort(String[] arr,int div, int mod, int range) {

        String[] ans = new String[arr.length];

        // make freqency array
        int[] freq = new int[range];
        for ( int i=0; i<arr.length; i++ ){
            freq[Integer.parseInt(arr[i], 10) / div % mod ]++;
        }

        // convert into prefix sum array
        for (int i=1; i<freq.length; i++ ){
            freq[i] = freq[i] + freq[i-1];
        }


        // stable sorting ( and filling as array )
        for ( int i=arr.length-1; i>=0; i-- ){
            int pos = freq[Integer.parseInt(arr[i], 10) / div % mod] - 1;
            ans[pos] = arr[i];
            freq[ Integer.parseInt(arr[i] , 10) / div % mod]--;
        }

        for ( int i=0; i<arr.length; i++ ){
            arr[i] = ans[i];
        }
    }

    public static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scn.next();
            arr[i] = str;
        }
        sortDates(arr);
        print(arr);
    }

}
