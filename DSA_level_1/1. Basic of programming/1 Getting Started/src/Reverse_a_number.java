//import java.util.Scanner;
//
//public class Reverse_a_number {
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//
//        int pointer = 0;
//        int temp = num;
//        while (temp != 0) {
//            pointer++;
//            temp = temp / 10;
//        }
//        int div = (int) Math.pow(10, pointer - 1);
//        System.out.println("This is divisior : "+div);
//
//        int value = 0;
//        while ( div!=0 ){
//            if ( value==0 ) {
//                value=num%10;
//            }
//            else{
//                int first_num = num%10;
//                value = value*10 + first_num;
//            }
//            num = num/10;
//            div = div/10;
//        }
//        System.out.println(value);
//
//    }
//}
//// 455
//// 4 -->> 4
//// 5 -->> 5 >> 4%10==0 --> no >> 4*10 = 40 + 5
//// 6 -->> 6 >> 45%10==0 --> no >> 45*10 = 450 + 6 = 456


import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while ( num!=0 ){
            System.out.println(num%10);
            num = num/10;
        }

    }
}