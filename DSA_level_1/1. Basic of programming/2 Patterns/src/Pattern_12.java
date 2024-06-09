import java.util.*;

public class  Pattern_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int num1 = 0;
        int num2 = 1;
        for ( int i=0; i<num; i++ ){
            for ( int j=0; j<=i; j++ ){
                System.out.print(num1 + "\t");
                int value = num1;
                num1 = num2;
                num2 = value + num2;
            }
            System.out.println();
        }
    }
}