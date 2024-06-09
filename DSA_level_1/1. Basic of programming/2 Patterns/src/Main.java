import java.util.Scanner;

public class Main {

    public static void function(int num, int val){

        int count = 0;
        while( num!=0 ){
            System.out.println("-----");
            if ( num%10==val ) count++;
            num = num / 10;
        }
        System.out.println("count : " + count);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();

        int num1 = 112233;
//        System.out.println(num1/10);
//        System.out.println(num1%10);
        function(num1, 2);

    }
}