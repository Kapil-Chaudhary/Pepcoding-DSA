/*

1. You are given a string that contains only lowercase and uppercase alphabets.
2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1


Input Format
A String

Output Format
A String


Constraints
1 <= length of string <= 1000

Sample Input
pepCODinG


Sample Output
p-11e11p-45C12O-11D37i5n-39G


 */


import java.util.Scanner;

public class String_With_Difference_Of_Every_Two_Consecutive_Characters {
    public static String solution(String str){

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for ( int i=1; i<str.length(); i++ ){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int diff = curr - prev;

            sb.append(diff);
            sb.append(curr);
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }
}
