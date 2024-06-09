import java.util.Scanner;

public class Main {

    // 123 -- abc
    public static void printEncodings(String str, String ans) {

        if (str.length()==0 ) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        if ( ch=='0' ) return;
        else {
            int chv = ch - '0';
            char code = (char) ('a' + chv - 1);
            printEncodings(ros, ans + code);
        }

        if ( str.length()==1 ) return;
        else{
            String  ch12 = str.substring(0,2);
            String ros12 = str.substring(2);

            int chi = Integer.parseInt(ch12);
            if ( chi>26 ) return;
            else {
                char code = (char) ( 'a' + chi -1 );
                printEncodings(ros12, ans + code);
            }
        }


    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        printEncodings("123", "");

    }
}


//    char ch = str.charAt(0);
//    String ch1 = str.substring(0, 2);
//
//    int chv = ch - '0';
//    char code = (char)('a' + chv - 1 );
//
//    int ch12v = Integer.parseInt(ch1);
//    char code1;
//        if ( ch12v<=26 ) {
//                code1 = (char) ('a' + ch12v - 1);
//                }