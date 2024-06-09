/*

1. You are given a string str.
2. You are required to find the character with maximum frequency.

Input Format
A string str

Output Format
The character with highest frequency


Constraints
0 < str.length() <= 100
There will be a single character with highest frequency



Sample Input
-----------------------
zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc

Sample Output
--------------------
q

 */


import java.util.Scanner;

public class Maximum_Occurring_Character_In_A_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int[] arr = new int[128];

        for( int i=0; i<str.length(); i++){

            char ch = str.charAt(i);
            arr[ch] += 1;
        }
        int max = 0;
        int index = -1;
        for ( int i=0; i<arr.length; i++){
            if ( arr[i]>max ) {
                max=arr[i];
                index = i;
            }
        }
        System.out.println((char)(index));
    }
}