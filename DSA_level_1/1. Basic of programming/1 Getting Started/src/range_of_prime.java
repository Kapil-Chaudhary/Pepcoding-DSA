import java.util.Scanner;

public class range_of_prime {

    public static void check_prime(int num) {
        int count = 0;
        for (int div = 2; div * div <= num; div++) {
            if (num%div == 0) {
                count++;
                break;
            }
        }
        if ( count==0 ) System.out.println(num);
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        for ( int i=num1; i<=num2; i++){
            check_prime(i);
        }
    }
}
