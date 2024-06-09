import java.util.*;

public class  Pattern_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int value = 1;
        for ( int i=1; i<=num; i++ ){
            for ( int j=1; j<=i; j++ ){
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }
}

/*

1
2	3
4	5	6
7	8	9	10
11	12	13	14	15

 */