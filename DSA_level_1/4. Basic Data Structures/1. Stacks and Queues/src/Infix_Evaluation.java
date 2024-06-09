/*

1. You are given an infix expression.
2. You are required to evaluate and print it's value.

Input Format
Input is managed for you

Output Format
Value of infix expression

Constraints
1. Expression is balanced
2. The only operators used are +, -, *, /
3. Opening and closing brackets - () - are used to impact precedence of operations
4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
5. In two operators of equal precedence give preference to the one on left.
6. All operands are single digit numbers.


Sample Input
2 + 6 * 4 / 8 - 3

Sample Output
2

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Infix_Evaluation {

    public static int precedence(char optor){
        if ( optor=='+' ) return 1;
        else if ( optor=='-' ) return 1;
        else if ( optor=='*' ) return 2;
        else return 2;
    }

    public static int operation(int v1, int v2, char optor){
        if ( optor=='+' ) return v1+v2;
        else if ( optor=='-' ) return v1-v2;
        else if ( optor=='*' ) return v1*v2;
        else return v1/v2;
    }

    public static int infixEvaluation(String str){

        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for ( int i=0; i<str.length(); i++ ){
            char ch = str.charAt(i);

            if ( ch=='(' ){
                optors.push(ch);
            }
            else if ( Character.isDigit(ch) ){
                opnds.push(ch - '0');
            }
            else if ( ch==')' ){
                while ( optors.peek()!='(' ){
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                optors.pop();
            }
            else if ( ch=='+' || ch=='-' || ch=='*' || ch=='/' ){
                // ch is waiting higher priority to solve first
                while ( optors.size()>0 && optors.peek()!='(' && precedence(ch)<=precedence(optors.peek()) ){
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                // ch is pushing itself now
                optors.push(ch);
            }
        }

        while ( optors.size()!=0 ){
            char optor = optors.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();

            int opv = operation(v1, v2, optor);
            opnds.push(opv);
        }

//        return opnds.peek();
        int ans = opnds.pop();
        if ( opnds.size()>0 ) {
//            return Integer.parseInt(str.substring(1, str.length()-1)); // ""30""
            return Integer.parseInt(str);
        }
        else return ans;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();


        str = str.replaceAll("\\s", "");   // it remove spaces from both side
        int ans = infixEvaluation(str);
        System.out.println(ans);


    }
}


//2+6*4/8-3
// 2+(5-3*6/2)