/*

1. Your friend is typing his name into a faulty keyboard.
2. Sometimes, when typing a character 'c', the key might get long pressed, and the character will be typed 1 or more times.
3. You examine the typed characters of the keyboard. Return 'True' if it is possible that it was your friends name, with some characters (possibly none) being long pressed.


Input Format
name = "mannu", typed = "mmaannu"
name = "sumeet", typed = "sumeet"
name = "shree", typed = "sshrre"

Output Format
true
[Explanation: 'm' and 'a' in 'mannu' were long pressed.]
true
[Explanation: It's not necessary to long press any character.]
false
[Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.]


Constraints
-----------------
1. 1 <= name.length <= 1000
2. 1 <= typed.length <= 1000
3. name and typed contain only lowercase English letters.


Sample Input
-------------------
shree
sshhrreee
Sample Output
true


 */


// method 1
//import java.util.Scanner;
//
//public class Faulty_Keyboard {
//    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~
//
//    public static boolean isPossible(String name, String typed) {
//
//        if ( ((name.length()==1 && typed.length()==1) && (name.charAt(0)!=typed.charAt(0))) ||
//                (name.charAt(0)!=typed.charAt(0)) ) return false;
//
//        int i=0;
//        int j=0;
//        while ( i<name.length() ){
//            if ( j==typed.length() ) return false;
//            if ( name.charAt(i)==typed.charAt(j) ){
////                System.out.println(name.charAt(i) + "\t" + typed.charAt(j));
//                i++;
//                j++;
//            }
//            else if ( (name.charAt(i)!=typed.charAt(j)) && (typed.charAt(j)==name.charAt(i-1)) ){
//                j++;
//            }
//            else {
//                return false;
//            }
//        }
////        System.out.println(i + "\t" + j);
//        for ( int idx=j; idx<typed.length(); idx++ ){
//            if ( name.charAt(i-1)!=typed.charAt(idx) ) return false;
//        }
//        return true;
//    }
//
//    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~
//
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//
//        String name = scn.next();
//        String typed = scn.next();
//
//        boolean res = isPossible(name, typed);
//
//        System.out.println(res);
//    }
//}


// method 2
import java.util.Scanner;
public class Faulty_Keyboard {

    public static boolean isPossible(String name, String typed){
        if ( name.charAt(0)!=typed.charAt(0) || name.charAt(name.length()-1)!=typed.charAt(typed.length()-1)) return false;

        int i = 0;
        int j = 0;
        while ( j<typed.length() ){

            if ( i==name.length() ) i--;
            if ( (name.charAt(i)==typed.charAt(j)) ) {
                System.out.println("type 1 : " +  i + "\t" + j);
                i++;
                j++;
            }
            else if ( name.charAt(i-1)==typed.charAt(j) ){
                System.out.println("type 2 : " +  (i-1) + "\t" + j);
                j++;
            }
            else return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String name = scn.next();
        String typed = scn.next();

        boolean res = isPossible(name, typed);
        System.out.println(res);
    }
}

/*

true
alex
aaleex

true
mannu
mmaannu

true
sumeet
sumeet

shree
sshrre

shree
sshhrreee


alex
aaleexa

alex
aaleelx

rick
kric


false
pyplrz
ppyypllr


 */

