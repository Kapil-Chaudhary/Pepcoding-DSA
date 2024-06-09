    import java.util.Scanner;
    public class GCD_and_LCM {

        // method 1 -->> finding GCD
        public static int GCD(int num1, int num2 ){
            while ( num2%num1 != 0 ){
                int remainder = num2 % num1;
                num2  = num1;
                num1 = remainder;
            }
            return num1;
        }

        // method of finding LCM
        // formula of LCM IS :   ( num1 * num2 ) / GCD
        public static int LCM(int num1, int num2 ){
            int o_num1 = num1;
            int o_num2 = num2;
            int gcd = GCD(num1, num2);
            return ( o_num1 * o_num2) / gcd;
        }

        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println(GCD(num1, num2));
            System.out.println(LCM(num1,num2));
        }
    }