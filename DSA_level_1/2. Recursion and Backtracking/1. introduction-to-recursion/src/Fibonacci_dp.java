import java.util.Scanner;

public class Fibonacci_dp {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(fibonaacii(num));
    }

    public static int fibonaacii(int num){

        if ( num==0  ){
            return 0;
        }
        if ( num==1 ){
            return 1;
        }
        int fibo = fibonaacii(num-1) + fibonaacii(num-2);
        return fibo;
    }
}
