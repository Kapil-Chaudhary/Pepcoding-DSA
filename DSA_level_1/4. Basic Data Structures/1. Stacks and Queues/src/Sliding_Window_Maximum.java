/*

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the elements of array a.
3. You are given a number k, representing the size of window.
4. You are required to find and print the maximum element in every window of size k.

e.g.
for the array [2 9 3 8 1 7 12 6 14 4 32 0 7 19 8 12 6] and k = 4, the answer is [9 9 8 12 12 14 14 32 32 32 32 19 19 19]
Input Format
Input is managed for you
Output Format
Maximum of each window in separate line




Constraints
0 <= n < 100000
-10^9 <= a[i] <= 10^9
0 < k < n

Sample Input
17
2
9
3
8
1
7
12
6
14
4
32
0
7
19
8
12
6
4


Sample Output
9
9
8
12
12
14
14
32
32
32
32
19
19
19

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Sliding_Window_Maximum {


    public static int[] nextGrater(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];

        stack.push(arr.length-1);
        ans[arr.length-1] = ans.length;

        for ( int i= arr.length-2; i>=0; i-- ) {
            if ( arr[i]>arr[stack.peek()]) {
                while (stack.size() > 0 && arr[i] > arr[stack.peek()]) {
                    stack.pop();
                }
                if (stack.size() == 0) {
                    ans[i] = arr.length;
                    stack.push(i);
                } else {
                    ans[i] = stack.peek();
                    stack.push(i);
                }
            }else {
                ans[i] = stack.peek();
                stack.push(i);
            }
        }
        return ans;
    }

    public static int[] Solution(int[] arr, int[] nextGraterArr, int k ){

        int[] ans = new int[arr.length-k+1];
        // code
        for ( int i=0; i<= arr.length-k; i++ ){
            int j = i;
            while ( nextGraterArr[j]<i+k ){
                j = nextGraterArr[j];
            }
            ans[i] = arr[j];
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        for(int i = 0; i < n; i++) a[i] = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());


        // find next grater element
        int[] nextGraterArr = nextGrater(a);

        int[] ans = Solution(a, nextGraterArr, k);
        // System.out.println(Arrays.toString(ans));
        for ( int i=0; i<ans.length; i++ ) System.out.println(ans[i]);
    }
}