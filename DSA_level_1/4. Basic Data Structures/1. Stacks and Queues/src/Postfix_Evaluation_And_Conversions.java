/*

1. You are given a postfix expression.
2. You are required to evaluate it and print it's value.
3. You are required to convert it to infix and print it.
4. You are required to convert it to prefix and print it.

Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.


Input Format
Input is managed for you


Output Format
value, a number
infix
prefix


Constraints
1. Expression is a valid postfix expression
2. The only operators used are +, -, *, /
3. All operands are single digit numbers.

Sample Input
264*8/+3-

Sample Output
2
((2+((6*4)/8))-3)
-+2/*6483

 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Postfix_Evaluation_And_Conversions {

    public static int operation(int v1, int v2, char ch){
        if ( ch=='+' ) return v1+v2;
        else if ( ch=='-' ) return v1-v2;
        else if ( ch=='*' ) return v1*v2;
        else return v1/v2;
    }


    public static void solution(String str){
        Stack<Integer>  vs = new Stack<>();  // value
        Stack<String> is = new Stack<>();    // infix
        Stack<String> ps = new Stack<>();    // prefix

        for ( int i=0; i<str.length(); i++ ){
            char ch = str.charAt(i);

            if ( ch=='+' || ch=='-' || ch=='*' || ch=='/' ){
                int v2 = vs.pop();
                int v1 = vs.pop();
                int val = operation(v1, v2, ch );
                vs.push(val);

                String iv2 = is.pop();
                String iv1 = is.pop();
                String ival = "(" + iv1 + ch + iv2 + ")";
                is.push(ival);

                String pv2 = ps.pop();
                String pv1 = ps.pop();
                String pval = ch + pv1 + pv2 ;
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

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        solution(exp);
    }
}
