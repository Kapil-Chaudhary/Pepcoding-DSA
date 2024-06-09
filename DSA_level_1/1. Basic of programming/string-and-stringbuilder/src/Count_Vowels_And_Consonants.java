/*

Write a program to count the number of vowels and consonants in a given string.

Input Format
A string str

Output Format
Vowels count
Consonants count

Constraints
1<=str.length()<=1000


Sample Input
aeiou

Sample Output
5
0


 */


import java.util.ArrayList;
import java.util.Scanner;

public class Count_Vowels_And_Consonants {

    public static void counter(String str ){
        ArrayList<Character> ar = new ArrayList<>();
        ar.add('a');
        ar.add('e');
        ar.add('i');
        ar.add('o');
        ar.add('u');

        ar.add('A');
        ar.add('E');
        ar.add('I');
        ar.add('O');
        ar.add('U');


        int vc = 0;
        int cc = 0;
        for ( int i=0; i<str.length(); i++ ){
            char ch = str.charAt(i);
            if ( ar.contains(ch) ){
                vc++;
            }else cc++;
        }
        System.out.println(vc + "\n" + cc);

    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        counter(str);
    }
}
