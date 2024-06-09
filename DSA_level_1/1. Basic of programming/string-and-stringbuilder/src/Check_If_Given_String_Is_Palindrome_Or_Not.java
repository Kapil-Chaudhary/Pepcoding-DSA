import java.util.Scanner;

public class Check_If_Given_String_Is_Palindrome_Or_Not {

    public static boolean check_palindrone(String str){
        for ( int i=0; i<str.length()/2; i++){
            if ( str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);


        StringBuilder sb = new StringBuilder(scan.next());
        System.out.println(check_palindrone(sb.toString()));
    }
}
