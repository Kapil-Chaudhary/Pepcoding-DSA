/*

1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.


Input Format
-----------------------
A number n



Output Format
------------------------
Contents of the arraylist containing paths as shown in sample output




Constraints
-----------------------
0 <= n <= 10


Sample Input
---------------------
3


Sample Output
------------------------
[111, 12, 21, 3]



 */



import java.util.ArrayList;
import java.util.Scanner;

public class Get_Stair_Paths {

    public static ArrayList<String> getStairPaths(int n) {

        if ( n==0 ){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        if ( n<0 ){
            ArrayList<String> neg= new ArrayList<>();
            return neg;
        }

        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);

        ArrayList<String> res = new ArrayList<>();
        for ( String var : path1 ){
            res.add(1 + var);
        }
        for ( String var : path2 ){
            res.add(2 + var);
        }
        for ( String var : path3 ){
            res.add(3 + var);
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        ArrayList<String> ans = getStairPaths(num);
        System.out.println(ans);

    }
}
