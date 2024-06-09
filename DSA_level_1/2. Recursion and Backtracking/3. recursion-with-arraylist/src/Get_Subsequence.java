/*

1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.


Input Format
--------------------
A string str


Output Format
-----------------------
Contents of the arraylist containing subsequences as shown in sample output

 */


import java.util.ArrayList;
import java.util.Scanner;

public class Get_Subsequence {
    public static ArrayList<String> gss(String str){
        if ( str.length()==0 ) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String sub = str.substring(1);
        ArrayList<String> recans = gss(sub);

        ArrayList<String> res = new ArrayList<>();
        for ( String s : recans){
            res.add(s);
        }
        for ( String s : recans){
            res.add( ch + s );
        }
        return  res;
    }

    public static void main(String[] args)  throws Exception{
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        ArrayList<String> answer = gss(str);
        System.out.println(answer);

        // if str = "a"
//        System.out.print(str.charAt(0) + "_"); // a_
//        System.out.print(str.substring(1) + "_"); // ""_ = _
//        System.out.println(Integer.parseInt("1")); // 1


    }
}
