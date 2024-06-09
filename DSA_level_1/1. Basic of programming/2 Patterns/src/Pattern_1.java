import java.util.Scanner;

public class Pattern_1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for ( int i=1; i<=num; i++){
            System.out.println("*\t".repeat(i));
        }
    }
}

/*

*
* *
* * *
* * * *
* * * * *

 */