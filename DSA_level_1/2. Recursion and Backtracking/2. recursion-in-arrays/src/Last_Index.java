/*

1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number x.
4. You are required to find the last index at which x occurs in array a.
5. If x exists in array, print the last index where it is found otherwise print -1.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.


Input Format
-------------------
A number n
n1
n2
.. n number of elements
A number x


Output Format
-----------------------------
A number representing last index of occurence of x in array a or -1 if not found at all.



Constraints
-----------------------
1 <= n <= 10^4
0 <= n1, n2, .. n elements <= 10 ^ 3
0 <= x <= 10 ^ 3


Sample Input
--------------------------
6
15
11
40
4
4
9
4


Sample Output
----------------------------
4


 */

import java.util.Scanner;
public class Last_Index {


    public static int firstIndex(int[] arr, int idx, int ele) {
        if ( idx==arr.length-1 ) return -1;

        int liisa = firstIndex(arr, idx+1, ele);
        if( liisa==-1) {
            if ( arr[idx]==ele ) return idx;
            else return liisa;
        }
        else {
            return liisa;
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int  num = scan.nextInt();

        int[] arr = new int[num];
        for ( int i=0; i<arr.length; i++) arr[i]=scan.nextInt();

        int ele = scan.nextInt();

//        System.out.println(Arrays.toString(arr));
        System.out.println(firstIndex(arr, 0, ele));
    }
}