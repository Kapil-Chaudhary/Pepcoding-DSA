import java.util.Scanner;

public class Print_All_Permutations_Of_A_String_Iteratively {

    public static int factorial(String str){
        int num = 1;
        for ( int i=1; i<=str.length(); i++ ){
            num = num * i;
        }
        return num;
    }


    public static void printPermutation(String str){
        int length = str.length();
        int factorial = factorial(str);

        for ( int i=0; i<factorial; i++ ){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for ( int dev=length; dev>=1; dev-- ){
                int r = temp % dev;
                int q = temp / dev;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        printPermutation(str);

    }
}
