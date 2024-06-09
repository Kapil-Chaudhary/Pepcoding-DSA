import java.util.Scanner;

public class Count_digit_in_a_number {

    public static void countDigits(int num){
        int count = 0;
        while ( num>0 ){
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 12345;
//        System.out.println( num/10 ); // 1234
//        System.out.println(num%10); // 5
        countDigits(num);
    }
}