/*

1. You are given a number n.
2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.


Input Format
A number n


Output Format
factorial of n


Constraints
0 <= n <= 10

Sample Input
5

Sample Output
120

 */



import java.util.Scanner;
public class Factorial {

//    public static int factorial(int num){
//        if ( num==1 ) return 1;
//        int val = factorial(num-1) * num;
//        return val;
//    }

        public static int factorial(int num){
            if ( num==1 ) return 1;
            int mynum = factorial(num-1);
            int val = mynum * num;
            return val;
        }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(factorial(num));
    }
}
