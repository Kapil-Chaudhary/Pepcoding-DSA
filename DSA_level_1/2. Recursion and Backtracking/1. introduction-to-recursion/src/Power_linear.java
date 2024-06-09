/*

1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function .

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Input Format
A number x
A number n

Output Format
x raised to the power n


Constraints
1 <= x <= 10
0 <= n <= 9

Sample Input
2
5

Sample Output
32


 */


// method 1
//import java.util.Scanner;
//
//public class Power_linear {
//
//    public static int power(int x, int n){
//        if ( n==0 ) return 1;
//        int mynum = power(x , n-1);
//        int val = mynum * x;
//        return val;
//    }
//
//    public static void main(String[] args) throws Exception {
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        int pow = scan.nextInt();
//        System.out.println(power(num, pow));
//
//    }
//}


//import java.util.Scanner;
//
//public class Power_linear {
//
//    public static int power(int x, int n){
//        if ( n==0 ) return 1;
//        return  x * power(x, n-1);
//    }
//
//    public static void main(String[] args) throws Exception {
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        int pow = scan.nextInt();
//        System.out.println(power(num, pow));
//
//    }
//}


// method 2
import java.util.Scanner;
public class Power_linear{
    public static int powerLinear(int x, int n){
        if ( n==0 ) {
            System.out.println("now return :> " + "n is : " + n + " ans x is : " + x);
            return 1;
        }
//        if ( n==1 ) return x;
        System.out.println("n is : " + n + " ans x is : " + x);
        int mul = powerLinear(x, n/2-1);
        mul = mul * x;
        System.out.println("n is : " + n + " ans mul is : " + mul);

        if ( n%2==1 ){
            return mul*mul*x;
        }
        return mul*mul;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();

        System.out.println(powerLinear(x,n));
    }
}




// 4 types of solution



/*

import java.util.Scanner;

public class Main{


    public static double power1(double x, int n){
        if ( n==0 ) return 1;

        System.out.println("x : "+ x + " , n : " + n);
        double mynum = power1(x, n-1);
        double val = x * mynum;

        System.out.println("x : "+ x + " , n : " + n + " ,mynum : " + mynum + " ,val : " + val);

        return val;
    }


    public static double power2(double x, int n){
        if ( n==0 ) return 1;
        System.out.println("x : "+ x + " , n : " + n);

        double mynum = power2(x, n/2);
        double val = mynum * mynum;

        System.out.println("x : "+ x + " , n : " + n + " ,mynum : " + mynum + " ,val : " + val);
        if ( n%2==1 ) {
            System.out.println("pass");
            return x*val;
        }
        return val;
    }

    public static double power3(double x, int n){

        if ( n==0 ) return 1;
        if ( n<0 ) {
            x = 1/x;
            n = -1 * n;
        }

        System.out.println("x : "+ x + " , n : " + n);
        double mynum = power1(x, n-1);
        double val = x * mynum;

        System.out.println("x : "+ x + " , n : " + n + " ,mynum : " + mynum + " ,val : " + val);

        return val;


    }


    public static double power4(double x, int n){
        if ( n==0 ) return 1;
        if ( n<0 ){
            x = 1/x;
            n = -1 * n;
        }

        System.out.println("x : "+ x + " , n : " + n);

        double mynum = power4(x, n/2);
        double val = mynum * mynum;
        if ( val < -10000 || val > 10000 ) return 0.0;

        System.out.println("x : "+ x + " , n : " + n + " ,mynum : " + mynum + " ,val : " + val);
        if ( n%2==1 ) {
            System.out.println("pass");
            System.out.println("mynum : " + x*val);
            return x*val;
        }
        return val;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();

        double ans = power4(2, -2);
        System.out.println(ans);

//        System.out.println(-2/2); // -1
//        int a = 2147483647;
//        System.out.println(a);
    }
}


 */
