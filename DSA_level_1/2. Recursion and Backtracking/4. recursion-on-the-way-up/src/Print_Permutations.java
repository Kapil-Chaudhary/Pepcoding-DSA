/*

1. You are given a string str.
2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
Use sample input and output to take idea about permutations.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.



Input Format
A string str


Output Format
Permutations of str in order hinted by Sample output


Constraints
0 <= str.length <= 7


Sample Input
abc


Sample Output
abc
acb
bac
bca
cab
cba



 */



// solution 1
//import java.util.Scanner;
//
//public class Print_Permutations {
//    public static void main(String[] args) throws Exception {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//
//        printPermutations(str, "");
//    }
//
//    public static void printPermutations(String str, String asf) {
//        if ( str.length()==0 ){
//            System.out.println(asf);
//            return;
//        }
//
//        for ( int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            String l = str.substring(0, i);
//            String r = str.substring(i+1);
//            String res = l+r;
//            printPermutations(res, asf+ch);
//        }
//    }
//}



// solution 2
import java.util.ArrayList;
import java.util.Scanner;

public class Print_Permutations {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(printPermutations(str));
    }

    // method 1
    public static ArrayList<String> printPermutations(String str) {
        if ( str.length()==0 ){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> recans = printPermutations(ros);
        ArrayList<String> myans = new ArrayList<>();

        for ( String s: recans ){
            for ( int i=0; i<=s.length(); i++ ){
                String l = s.substring(0, i);
                String r = s.substring(i);
                myans.add(l+ch+r);
//                System.out.println(myans);
            }
        }
        return myans;
    }


    // method 2
    public static void printPermutations(String str, String asf) {
        if ( str.length()==0 ){
            System.out.println(asf);
            return;
        }

        for ( int i=0; i<str.length(); i++ ){
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i+1, str.length());
            printPermutations(ros, asf + ch);
        }
    }


    // method 3
    public static ArrayList<String> getPermutation(String str){

        if ( str.length()==0 ){
            ArrayList<String > base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> a = new ArrayList<>();
        for ( int i=0; i<str.length(); i++ ){
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i+1, str.length());
            ArrayList<String> rres = getPermutation(ros);

            for ( String s : rres ) a.add( ch + s);

        }
        return a;
    }

}
