/*

1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of printStairPaths function - without changing signature - to print the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.


Input Format
A number n


Output Format
Print paths (one path in each line) in order hinted by Sample output


Constraints
0 <= n <= 10


Sample Input
3


Sample Output
111
12
21
3

 */



import java.util.Scanner;
public class Print_Stair_Paths {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        printStairPaths(num , "");
    }

    public static void printStairPaths(int n, String path) {
        if ( n==0 ){
            System.out.println(path);
            return;
        }
        if ( n<0 ){
            return;
        }
        printStairPaths(n-1, path + "1");
        printStairPaths(n-2, path + "2");
        printStairPaths(n-3, path + "3");
    }
}
