import java.util.Scanner;

public class Digit_of_a_number {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int nod = 0;
        int temp = num;
        while (temp != 0) {
            nod += 1;
            temp = temp / 10;
        }

        int div = (int) Math.pow(10, nod - 1);
        while (div != 0) {
            System.out.println(num / div);
            num = num % div;
            div = div / 10;
        }
    }
}


// method 2

/*

import java.util.Scanner;

public class Main {

    public static int countDight(int num){

        int count = 0;
        while ( num!=0 ){
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void printDigits(int num){
       int div = (int) Math.pow(10, countDight(num)-1 );

       while ( num!=0 ){
           System.out.println(num / div);
           num = num % div;
           div = div / 10;
       }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

//        int num = 12345;
        printDigits(num);
    }
}


 */
