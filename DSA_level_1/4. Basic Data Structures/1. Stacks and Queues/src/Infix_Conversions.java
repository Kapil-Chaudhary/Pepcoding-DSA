/*

1. You are given an infix expression.
2. You are required to convert it to postfix and print it.
3. You are required to convert it to prefix and print it.

Input Format
Input is managed for you

Output Format
postfix
prefix


Constraints
1. Expression is balanced
2. The only operators used are +, -, *, /
3. Opening and closing brackets - () - are used to impact precedence of operations
4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
5. In two operators of equal precedence give preference to the one on left.
6. All operands are single digit numbers.


Sample Input
a*(b-c+d)/e
Sample Output
abc-d+*e/
/*a+-bcde


 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Infix_Conversions {

    public static int precedence(char op){
        if ( op=='+' || op=='-' ) return 1;
        else if ( op=='*' || op=='/' ) return 2;
        else return 0;
    }

    public static String operationPostfix(String v1, String v2, char op){
        String postfix = v1 + v2 + op;
        return postfix;
    }

    public static String operationPrefix(String v1, String v2, char op){
        String prefix =  op + v1 + v2;
        return prefix;
    }

    public static String[] infix_Conversions(String str){

        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for ( int i=0; i<str.length(); i++ ){
            char ch = str.charAt(i);

            if ( ch=='(' ){
                operators.push(ch);
            }
            else if ( (ch>='0' && ch<='9') || (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')  ){
                postfix.push(ch+"");
                prefix.push(ch+"");
            }
            else if ( ch==')' ){
                while ( operators.peek() != '(' ){
                    char op = operators.pop();

                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();
                    String postv = postv1 + postv2 + op;
                    postfix.push(postv);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String prev = op + prev1 + prev2;
                    prefix.push(prev);

                }
                operators.pop();

            }
            else if ( ch=='+' || ch=='-' || ch=='*' || ch=='/' ){
                while ( (operators.size()>0) &&
                        (operators.peek() != '(') &&
                        (precedence(ch)<=precedence(operators.peek())) ){

                    char op = operators.pop();

                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();
                    String postv = postv1 + postv2 + op;
                    postfix.push(postv);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String prev = op + prev1 + prev2;
                    prefix.push(prev);

                }
                operators.push(ch);
            }

//            System.out.println("post : " + postfix  + "    ||    " + "pre : " + prefix + "    ||   " + "ops : " + operators  );
//            System.out.println();

        }

        while ( operators.size()>0 ){
            char op = operators.pop();

            String postv2 = postfix.pop();
            String postv1 = postfix.pop();
            String postv = operationPostfix(postv1, postv2, op);
            postfix.push(postv);

            String prev2 = prefix.pop();
            String prev1 = prefix.pop();
            String prev = operationPrefix(prev1, prev2, op);
            prefix.push(prev);
        }

//        System.out.println(postfix.peek());
//        System.out.println(prefix.peek());

        String[] ans = {postfix.peek(), prefix.peek()};
        return ans;

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        String[] ans = infix_Conversions(exp);

        String postfix = ans[0];
        String prefix = ans[1];

        System.out.println(postfix + "\n" + prefix);
    }
}
