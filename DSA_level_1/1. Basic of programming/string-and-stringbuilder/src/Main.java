import java.util.Scanner;

public class Main {

    public static int factorial(int num){

        int fact = 1;
        for ( int i=1; i<=num; i++ ) fact = fact*i;

        return fact;
    }

    public static void solution(String str) {

        int fact = factorial(str.length());
        System.out.println(fact);

        for ( int i=0; i<fact; i++ ){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for ( int j=str.length(); j>=1; j-- ){
                int r = temp % j;
                int q = temp / j;

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
        solution(str);
    }
}