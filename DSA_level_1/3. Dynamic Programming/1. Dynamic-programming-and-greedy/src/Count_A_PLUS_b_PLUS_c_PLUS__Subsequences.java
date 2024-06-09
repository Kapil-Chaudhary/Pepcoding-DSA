/*

        discription
---------------------------
1. You are given a string str.
2. You are required to calculate and print the count of subsequences of the nature a+b+c+.
For abbc -> there are 3 subsequences. abc, abc, abbc
For abcabc -> there are 7 subsequences. abc, abc, abbc, aabc, abcc, abc, abc.


Input Format
A string str

Output Format
count of subsequences of the nature a+b+c+

Constraints
0 < str.length <= 10



---- input ----
abcabc


--- output -----
7

 */


import java.util.Scanner;

public class Count_A_PLUS_b_PLUS_c_PLUS__Subsequences {

    public static int Count_A_PLUS_b_PLUS_c_PLUS__Subsequences(String str ){
        int a = 0;
        int ab = 0;
        int abc = 0;

        for ( int i=0; i<str.length(); i++ ){
            char ch = str.charAt(i);

            if ( ch=='a' ){
                a = 2 * a + 1;
            }
            else if ( ch=='b' ){
                ab = 2 * ab + a;
            }
            else if ( ch=='c' ){
                abc = 2 * abc + ab;
            }
        }
        return abc;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int ans = Count_A_PLUS_b_PLUS_c_PLUS__Subsequences(str);
        System.out.println(ans);
    }
}

