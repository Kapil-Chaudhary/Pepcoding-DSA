/*

1. Here are a few sets of inputs and outputs for your reference
Input1 -> 1
Output1 -> 1 1 1

Input2 -> 2
Output2 -> 2 1 1 1 2 1 1 1 2

Input2 -> 3
Output3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3

2. Figure out the pattern and complete the recursive function pzz to achieve the above for any positive number n.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.




Input Format
---------------------
A number n


Output Format
-------------------------
As discussed in point 1 of description



Constraints
--------------------
1 <= n <= 10



Sample Input
----------------------
3


Sample Output
--------------------------
3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3

 */


import java.util.Scanner;
public class Print_Zigzag {
        public static void pzz(int n){
            if ( n==0 ) return ;
            System.out.print(n + " "); //1
            pzz(n-1);                    //2
            System.out.print(n + " ");  //3
            pzz(n-1);                    //4
            System.out.print(n + " ");  //5
        }

        public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();

            pzz(num);

        }
}
