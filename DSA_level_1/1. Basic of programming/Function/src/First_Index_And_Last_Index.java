/*

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.

Asssumption - Array is sorted. Array may have duplicate values.


Input Format
---------------
A number n
n1
n2
.. n number of elements
A number d


Output Format
------------------
A number representing first index
A number representing last index


Constraints
1 <= n <= 1000
1 <= n1, n2, .. n elements <= 100
1 <= d <= 100


Sample Input
--------------
15
1
5
10
15
22
33
33
33
33
33
40
42
55
66
77
33


Sample Output
----------------
5
9

 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class First_Index_And_Last_Index{

    public static int[] searchRange(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        int lastIndex = -1;
        while ( left<=right ){
            int mid = ( left + right ) / 2;

            if ( nums[mid]==target ){
                lastIndex = mid;
                left = mid+1;
            }
            else if ( nums[mid]>target ) right = mid-1;
            else if ( nums[mid]<target ) left = mid+1;
        }


        left = 0;
        right = nums.length - 1;

        int firstIndex = -1;
        while ( left<=right ){
            int mid = ( left+right ) / 2;

            if ( nums[mid]==target ){
                firstIndex = mid;
                right = mid-1;
            }
            else if ( nums[mid]>target ) right = mid-1;
            else if ( nums[mid]<target ) left = mid+1;
        }

        int[] ans =  {firstIndex, lastIndex};
        return ans;

    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int element = Integer.parseInt(br.readLine());

        int[] ans = searchRange(a, element);
        for(int val : ans ) System.out.println(val);
    }
}
