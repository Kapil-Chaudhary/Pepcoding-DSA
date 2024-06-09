//import java.io.IOException;
//import java.util.*;
//
//public class Non_Repeating_Character {
//
//    // -----------------------------------------------------
//    // This is a functional problem. Only this function has to be written.
//    // This function takes as input a string
//    // It should print required output.
//    public static void solve(String s){
//        HashMap<Character , Integer> map = new HashMap<>();
//        for ( int i=0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            if ( map.containsKey(ch) ){
//                map.put(ch, map.get(ch)+1);
//            }else{
//                map.put(ch, 1);
//            }
//        }
//        String ret = "";
//        for ( int i=0; i<s.length(); i++ ){
//            if ( map.get(s.charAt(i))==1 ) {
//                ret = s.charAt(i)+"";
//                break;
//            }
//        }
//        if ( ret.length()==0 ) System.out.println(-1);
//        else System.out.println(ret);
//
//    }
//
//    public static void main(String[] args) throws IOException {
//        Scanner scn= new Scanner(System.in);
//        String s=scn.next();
//        solve(s);
//
//    }
//}


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Non_Repeating_Character  {

    // -----------------------------------------------------
    public static void solve2(String str){
        String[] ss = str.split("");
        ArrayList<String> al = new ArrayList<>(Arrays.asList(ss) );
        String ans = "";
        for ( int i=0; i<str.length(); i++){
            if (Collections.frequency(al, al.get(i))==1 ){
                ans = al.get(i);
                break;
            }
        }
        if ( ans.length()==0 ) System.out.println(-1);
        else System.out.println(ans);

    }

    public static void main(String[] args) throws IOException {
        Scanner scn= new Scanner(System.in);
        String s=scn.next();
        solve2(s);

    }
}
