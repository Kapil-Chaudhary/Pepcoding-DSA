/*


1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map :
    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.




Input Format
A string str


Output Format
Contents of the arraylist containing words as shown in sample output



Constraints
0 <= str.length <= 10
str contains numbers only



Sample Input
--------------------------
78


Sample Output
--------------------------
[tv, tw, tx, uv, uw, ux]

 */


import java.util.ArrayList;
import java.util.Scanner;

public class Get_Kpc {
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) {

        if ( str.length()==0 ){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String coodeforch = codes[ch - '0'];
        for (int i = 0; i < coodeforch.length(); i++) {
            char chcodes = coodeforch.charAt(i);

            for (String rstr : rres) {
                mres.add(chcodes + rstr);
            }
        }
        return mres; // it return as a ros ( in line number 66 )
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }
}
