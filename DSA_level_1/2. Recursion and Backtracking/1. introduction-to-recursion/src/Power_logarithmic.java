/*

1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function .

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Input Format
A number x
A number n

Output Format
x raised to the power n


Constraints
1 <= x <= 10
0 <= n <= 9

Sample Input
2
5

Sample Output
32


 */

import java.util.Scanner;
public class Power_logarithmic {

        public static int power(int x, int n){
            if ( n==0 ) {
//                System.out.println(" now return :>  " + "n is : "+n + " ans x is : "+x);
                return 1;
            }
//        System.out.println("n is : "+n + " ans x is :"+x);
            int mynum = power(x , n/2);
            int val = mynum * mynum;
//        System.out.println("val is : "+ val + " and num is : "+ n);

            if ( n%2==1 ) val = val*x;
            return val;
        }

        public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            int pow = scan.nextInt();
            System.out.println(power(num, pow));

        }
    }

