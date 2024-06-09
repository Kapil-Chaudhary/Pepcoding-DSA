import java.util.Scanner;

public class Pythagorean_Triplets {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int large_num = 0;
        int small_num1 = 0;
        int small_num2 = 0;
        if ( num1>num2 ){
            if ( num1>num3 ) {
                large_num=num1;
                small_num1 = num3;
                small_num2 = num2;
            }
            else {
                large_num=num3;
                small_num1 = num1;
                small_num2 = num2;
            }
        }
        else{
            if ( num2>num3 ) {
                large_num=num2;
                small_num1 = num3;
                small_num2 = num1;
            }
            else  {
                large_num=num3;
                small_num1 = num1;
                small_num2 = num2;
            }
        }
//        System.out.println("larger number is :  "+ large_num);
        if ( small_num1*small_num1 + small_num2*small_num2 == large_num*large_num ) System.out.println(true);
        else System.out.println(false);
    }
}
