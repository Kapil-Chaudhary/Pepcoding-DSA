import java.util.Scanner;

public class print_fibonacci {
    public static void main(String arch[]){
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int num1 = 0;
        int num2 = 1;
        for ( int i=0; i<value; i++){
            System.out.println(num1);
            int c = num1 + num2;
            num1 = num2;
            num2 = c;
        }
    }
}
