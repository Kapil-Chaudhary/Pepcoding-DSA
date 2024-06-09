//import java.util.Scanner;
//
//public class Reverse_String {
//    public static void main(String args[]){
//        Scanner scan = new Scanner(System.in);
//
//
//        StringBuilder sb = new StringBuilder(scan.next());
//
//        for ( int i=0; i<sb.length()/2; i++){
//            char first = sb.charAt(i);
//            char last = sb.charAt(sb.length()-1-i);
//            sb.setCharAt(i, last);
//            sb.setCharAt(sb.length()-1-i, first );
//        }
//        System.out.println(sb.toString());
//    }
//}


import java.util.Scanner;

public class  Reverse_String {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);


        StringBuilder sb = new StringBuilder(scan.next());

        for ( int i=0; i<sb.length()/2; i++){
            char first = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length()-1-i));
            sb.setCharAt(sb.length()-1-i, first );
        }
        System.out.println(sb.toString());
    }
}
