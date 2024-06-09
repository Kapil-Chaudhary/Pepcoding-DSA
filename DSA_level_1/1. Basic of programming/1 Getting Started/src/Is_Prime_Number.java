import java.util.Scanner;

public class Is_Prime_Number {

    // mathod to check prime number
    public static void check_prime(int num){
        int value = 0;
        for ( int div=2; div*div<=num; div++){
            if ( num%div==0 ) {
                value++;
                break;
            }
        }
        if ( value==0 ) System.out.println("prime");
        else System.out.println("not prime");

    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
//        int num = Integer.parseInt(scan.next());   // ----> convert string to integer
        for ( int i=0; i<num; i++){
            check_prime(scan.nextInt());
        }

    }
}
