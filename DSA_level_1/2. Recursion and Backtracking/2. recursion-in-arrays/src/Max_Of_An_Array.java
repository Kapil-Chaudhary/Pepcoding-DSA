// question
/*

1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the maximum of input.
4. For the purpose complete the body of maxOfArray function. Don't change the signature.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Input Format
---------------------
A number n
n1
n2
.. n number of elements


Output Format
------------------------
A number representing max


Constraints
--------------------
1 <= n <= 10^4
0 <= n1, n2, .. n elements <= 10 ^9


Sample Input
--------------------
6
15
30
40
4
11
9


Sample Output
-------------------------------------
40


 */


// solution 1
//import java.util.Scanner;
//
//public class Max_Of_An_Array {
//    public static void main(String[] args) throws Exception {
//        Scanner scan = new Scanner(System.in);
//        int  num = scan.nextInt();
//
//        int[] arr = new int[num];
//        for ( int i=0; i<arr.length; i++) arr[i]=scan.nextInt();
//
////        System.out.println(Arrays.toString(arr));
//        System.out.println(maxOfArray(arr, 0));
//    }
//
//    public static int maxOfArray(int[] arr, int idx){
//        if ( idx==arr.length-1 ) return arr[idx];
//
//        int misa = maxOfArray(arr, idx+1);
//        if ( misa>arr[idx] ) return misa;
//        else return arr[idx];
//    }
//
//}


// solution 2
import java.util.Scanner;
public class Max_Of_An_Array {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int  num = scan.nextInt();

        int[] arr = new int[num];
        for ( int i=0; i<arr.length; i++) arr[i]=scan.nextInt();

//        System.out.println(Arrays.toString(arr));
        System.out.println(maxOfArray(arr, 0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if ( idx==arr.length ) {
            return Integer.MIN_VALUE;
        }
        int first = arr[idx];
        int rest = maxOfArray(arr, idx+1);

        if ( first>rest ){
            return first;
        }
        else {
            return rest;
        }
    }
}