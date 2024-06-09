// question
/*

1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number x.
4. You are required to find the first index at which x occurs in array a.
5. If x exists in array, print the first index where it is found otherwise print -1.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.


Input Format
----------------------------
A number n
n1
n2
.. n number of elements
A number x


Output Format
-------------------------------
A number representing first index of occurence of x in array a or -1 if not found at all.




Constraints
----------------------
1 <= n <= 10^4
0 <= n1, n2, .. n elements <= 10 ^ 3
0 <= x <= 10 ^ 3


Sample Input
------------------------
6
15
11
40
4
4
9
4


Sample Output
------------------------
3


 */


// solution 1 ( good approch )
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//public class First_Index {
//
//    public static int firstIndex(int[] arr, int idx, int ele) {
//        if ( idx==arr.length ) return -1;
//
//        if ( arr[idx]==ele ){
//            return idx;
//        }
//        else {
//            int fiisa = firstIndex(arr, idx+1, ele);
//            return fiisa;
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        Scanner scan = new Scanner(System.in);
//        int  num = scan.nextInt();
//
//        int[] arr = new int[num];
//        for ( int i=0; i<arr.length; i++) arr[i]=scan.nextInt();
//
//        int ele = scan.nextInt();
//
////        System.out.println(Arrays.toString(arr));
//        System.out.println(firstIndex(arr, 0, ele));
//    }
//}





// solution 2 ( not good approch )
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class First_Index {
    public static int firstIndex(int[] arr, int idx, int x){
        if ( idx== arr.length ) return -1;
        else if ( arr[idx]==x ) return idx;
        int firstIndex = firstIndex(arr, idx+1, x);

        if ( arr[idx]==x ) return idx;
        return firstIndex;

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

        int element = Integer.parseInt(br.readLine());
        System.out.println(firstIndex(arr, 0, element ));

    }
}