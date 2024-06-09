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


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Highest_Frequency_Character {

    public static String frequency(String str){
        Map<Character,Integer> mp = new HashMap<>();
        for ( int i=0; i<str.length(); i++ ){
            if ( mp.containsKey(str.charAt(i))==true )  {
                int value =  mp.get(str.charAt(i)) + 1;
//                mp.replace(str.charAt(i),mp.get(str.charAt(i)),  value);
            }
            else mp.put(str.charAt(i), 1);
        }
        int max = Integer.MIN_VALUE;
        String cc = "";
        for ( int i=0; i<mp.size(); i++){
            if ( mp.get(str.charAt(i))>max ){
                max = mp.get(str.charAt(i));
                cc = str.charAt(i)+"";
            }
        }
        return cc;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String element = frequency(str);
        System.out.println(element);
    }
}
