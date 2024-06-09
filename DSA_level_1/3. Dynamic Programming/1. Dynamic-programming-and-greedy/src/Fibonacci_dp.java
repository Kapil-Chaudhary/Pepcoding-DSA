/*

1. You are given a number n.
2. You are required to print the nth element of fibonnaci sequence.

Note -> Notice precisely how we have defined the fibonnaci sequence
0th element -> 0
1st element -> 1
2nd element -> 1
3rd element -> 2
4th element -> 3
5th element -> 5
6th element -> 8


Input Format
A number n

Output Format
A number representing the nth element of fibonnaci sequence


Constraints
0 <= n <= 45


Sample Input
10

Sample Output
55


 */


import java.util.Scanner;
public class Fibonacci_dp {

    public static int fibonacci(int num){
        if ( num==0 || num==1 ) return num;

        int fiboNum1 = fibonacci(num-1);
        int fiboNum2 = fibonacci(num-2);
        int fibo = fiboNum1 + fiboNum2;

        return fibo;

    }


    // ----------       By Dynamic Programming       -------------
    public static int fibonacciMemoized(int num, int[] arr){
        if ( num==0 || num==1 ) {
            return num;
        }

        if ( arr[num]!=0 ){
            return arr[num];
        }

//        System.out.println("here number is : " + num);
        int fiboNum1 = fibonacciMemoized(num-1, arr);
        int fiboNum2 = fibonacciMemoized(num-2, arr);
        int fibo = fiboNum1 + fiboNum2;
        arr[num] = fibo;

        return fibo;

    }



    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int fibo = fibonacci(num);
        System.out.println("Without memorization : " + fibo);

        int arr[] = new int[num+1];
        int fiboMemoized = fibonacciMemoized(num, arr);
        System.out.println("with memoraization : " + fiboMemoized);

    }
}


// 0 1 1 2 3