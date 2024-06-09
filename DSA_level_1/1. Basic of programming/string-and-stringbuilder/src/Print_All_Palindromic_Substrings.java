/*

1. You are given a string.
2. You have to print all palindromic substrings of the given string.

Input Format
-----------------------
A String

Output Format
---------------------------------
All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

Constraints
---------------------
1 <= length of string <= 500

Sample Input
-------------------
abcc


Sample Output
------------------------
a
b
c
cc
c



 */


import java.util.Scanner;

public class Print_All_Palindromic_Substrings {

    public static boolean is_palindronic(String str){
        int start = 0;
        int end = str.length()-1;
        for ( int i=0; i<str.length(); i++){
            if ( str.charAt(start)!= str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        for ( int i=0; i<str.length(); i++){
            for ( int j=i; j<str.length(); j++){
                boolean bool = is_palindronic(str.substring(i, j+1));
                if ( bool==true ) System.out.println(str.substring(i,j+1));
            }
        }
    }
}