// question
/*

1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number x.
4. You are required to find the all indices at which x occurs in array a.
5. Return an array of appropriate size which contains all indices at which x occurs in array a.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.


Input Format
------------------------
A number n
n1
n2
.. n number of elements
A number x


Output Format
-------------------------
Return the array of indices from the allIndices function. Display is managed for you.



Constraints
---------------------
1 <= n <= 10^4
0 <= n1, n2, .. n elements <= 10 ^ 3
0 <= x <= 10 ^ 3


Sample Input
------------------
6
15
11
40
4
4
9
4


Sample Output
---------------------
3
4


 */



// solution 1
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class All_indices_Of_Array {
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        int x = Integer.parseInt(br.readLine());
//        int[] iarr = allIndices(arr, x, 0, 0);
//
//        if(iarr.length == 0){
//            System.out.println();
//            return;
//        }
//
//        for(int i = 0; i < iarr.length; i++){
//            System.out.println(iarr[i]);
//        }
//    }
//
//    public static int[] allIndices(int[] arr, int ele, int idx, int fsf) {
//        if ( idx== arr.length-1 ) {
//            return new int[fsf];
//        }
//        if ( arr[idx]==ele ) {
//            int[] rec = allIndices(arr, ele, idx+1, fsf+1);
//            rec[fsf]=idx;
//            return rec;
//        }else {
//            int[] rec = allIndices(arr, ele, idx+1, fsf);
//            return rec;
//        }
//    }
//}




// solution 2


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class  All_indices_Of_Array {

    public static int[] allIndices(int[] arr, int ele, int idx, int count) {
        if ( idx== arr.length-1 ) {
            int[] base = new int[count];
            return base;
        }

        if ( arr[idx]==ele ){
            count++;
        }
        int[] rec = allIndices(arr, ele, idx+1, count);
        if ( arr[idx]==ele ){
            rec[count-1] = idx;
            return rec;
        }
        else{
            return rec;
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }
}