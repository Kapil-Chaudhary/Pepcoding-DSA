/*

1. You are given a prefix expression.
2. You are required to evaluate it and print it's value.
3. You are required to convert it to infix and print it.
4. You are required to convert it to postfix and print it.

Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.

Input Format
Input is managed for you

Output Format
value, a number
infix
prefix


Constraints
1. Expression is a valid prefix expression
2. The only operators used are +, -, *, /
3. All operands are single digit numbers.

Sample Input
-+2/*6483

Sample Output
2
((2+((6*4)/8))-3)
264*8/



 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Prefix_Evaluation_And_Conversions {

    public static int operation(int v1, int v2, char ch){
        if ( ch=='+' ) return v1+v2;
        else if ( ch=='-' ) return v1-v2;
        else if ( ch=='*' ) return v1*v2;
        else  return  v1/v2;
    }

    public static void solution(String str){
        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for ( int i=str.length()-1; i>=0; i-- ){
            char ch = str.charAt(i);

            if ( ch=='+' || ch=='-' || ch=='*' || ch=='/' ){

                int v1 = vs.pop();
                int v2 = vs.pop();
                int val = operation(v1, v2, ch);
                vs.push(val);

                String iv1 = is.pop();
                String iv2 = is.pop();
                String ival = "(" + iv1 + ch + iv2 + ")";
                is.push(ival);

                String pv1 = ps.pop();
                String pv2  = ps.pop();
                String pval = pv1 + pv2 + ch;
                ps.push(pval);
            }
            else {
                vs.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");
            }

        }
        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        solution(str);
    }
}


/*

Sample Input
-+2/*6483

Sample Output
2
((2+((6*4)/8))-3)
264*8/

 */