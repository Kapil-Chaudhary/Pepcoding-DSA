//import java.util.Scanner;
//
//public class Main {
//
//    public static void rotate(int num, int r){
//
//        if ( r>Integer.toString(num).length() ) {
//            System.out.println("pass");
//            r = r % Integer.toString(num).length();
//        }
//        else if ( r<0 ) {
//            r =  Integer.toString(num).length() + r % Integer.toString(num).length();
//        }
////        System.out.println("r : " + r);
//
//
//        // now rotate part
//        int div = (int) Math.pow(10, r);
//        int mul = (int) Math.pow(10, Integer.toString(num).length() - r);
////        System.out.println("div : " + div + "/n" + "mul : " + mul);
//
//        int left = num % div;
//        int right = num / div;
////        System.out.println("left : "+ left);
////        System.out.println("right : " + right);
//
//        int number = left * mul + right;
//        System.out.println(number);
//
//
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
////        int num = scan.nextInt();
//
//        int num = 12345;
//        int r = 2;
//
//        rotate(num, r);
//    }
//}


import java.util.Scanner;

public class Main {

    public static void pattern(int num){

        for ( int i=1; i<=num; i++ ){
            System.out.println("* ".repeat(i));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();

        int num1 = 9;
        pattern(num1);

    }
}


