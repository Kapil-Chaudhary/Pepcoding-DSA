/*

1. You are given a string exp representing an expression.
2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
3. But, some of the pair of brackets maybe extra/needless.
4. You are required to print true if you detect extra brackets and false otherwise.

e.g.'
((a + b) + (c + d)) -> false
(a + b) + ((c + d)) -> true

Input Format
A string str

Output Format
true or false

Constraints
0 <= str.length <= 100

Sample Input
(a + b) + ((c + d))

Sample Output
true

 */

import java.util.Scanner;
import java.util.Stack;

public class Duplicate_Brackets {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        Stack<Character> stack = new Stack<>();

        for ( int i=0; i<str.length(); i++ ) {
            char ch = str.charAt(i);
            if ( ch==')' ) {
                if ( stack.peek()=='(' ) {
                    System.out.println(true);
                    return;
                }else{
                    while( stack.peek()!='(' ){
                        stack.pop();
                    }
                    stack.pop();
                }
            }
            else stack.push(ch);
        }
        System.out.println(false);
    }
}
// (a + b) + ((c + d))

