import java.util.*;

public class  Pattern_13 {

    public static int factorial(int num){
        int value = 1;
        for ( int i=2; i<=num; i++) value = value*i;
        return value;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for ( int i=0; i<num; i++ ){
            for ( int j=0; j<=i; j++ ){
                int value = factorial(i) / (factorial(j) * factorial(i-j));
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}

/*

1
1	1
1	2	1
1	3	3	1
1	4	6	4	1

 */

/*

combination = ncr =>
     n!
   ------
    r! * (n-r)!
 */