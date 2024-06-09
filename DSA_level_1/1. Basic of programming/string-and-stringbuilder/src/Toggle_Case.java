//import java.util.Scanner;
//
//public class Toggle_Case  {
//
//    public static String toggleCase(String str){
//
//        String temp = "";
//        for ( int i=0; i<str.length(); i++ ){
//            String s1 = str.charAt(i) + "";
//            String s2 = (str.charAt(i) + "").toUpperCase();
//
////            System.out.println(s1 + "\t" + s2);
//            if ( s1.equals(s2) )  temp += s1.toLowerCase();
//            else temp += s1.toUpperCase();
//        }
//
//        return temp;
//    }
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        String str = scn.next();
//        System.out.println(toggleCase(str));
//    }
//
//}


//// method 2

import java.util.Scanner;

public class Toggle_Case  {

    public static String toggleCase(String str){

        String temp = "";
        for ( int i=0; i<str.length(); i++ ){
            if ( Character.isLowerCase(str.charAt(i)) ) temp+= Character.toString(str.charAt(i)).toUpperCase();
            else temp+= Character.toString(str.charAt(i)).toLowerCase();

        }

        return temp;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}