/*

1. You are given a string exp representing an expression.
2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false


Input Format
A string str


Output Format
true or false


Constraints
0 <= str.length <= 100

Sample Input
[(a + b) + {(c + d) * (e / f)}]

Sample Output
tru

 */

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {

    public static boolean solution(Stack<Character> stack, String str){

        // ( = 1
        // { = 2
        // [ = 3
        for ( int i=0; i<str.length(); i++ ){
            char ch = str.charAt(i);
            if ( ch==')' || ch=='}' || ch==']' ){
                if ( stack.isEmpty() ) return false;
                else if ( ch==')' && stack.peek()=='1' ) stack.pop();
                else if ( ch=='}' && stack.peek()=='2' ) stack.pop();
                else if ( ch==']' && stack.peek()=='3' ) stack.pop();
                else return false;
            }

            else if ( ch=='(' || ch=='{' || ch=='[' ) {
                if ( ch=='(' ) stack.push('1');
                else if ( ch=='{' ) stack.push('2');
                else if ( ch=='[' ) stack.push('3');
            }
            else ;

            System.out.println("stack : " + stack);
        }
        if ( stack.isEmpty() ) return true;
        else return false;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean ans = solution(stack, str);
        System.out.println(ans);

    }
}
