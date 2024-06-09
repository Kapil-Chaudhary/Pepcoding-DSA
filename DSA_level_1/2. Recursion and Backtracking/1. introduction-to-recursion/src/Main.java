import java.util.Scanner;

public class Main{

   public static void printDecreasing(int num){
       if ( num==0 ) return;
       System.out.println(num);
       printDecreasing(num-1);
   }

   public static void printIncreasing(int num){
       if ( num==0 ) return;
       printIncreasing(num-1);
       System.out.println(num);
   }

   public static void printDecreasingIncreasing(int num){
       if ( num==0 ) return;
       System.out.println(num);
       printDecreasingIncreasing(num-1);
       System.out.println(num);
   }


   public static int factorial(int num){
       if ( num==1 ) return 1;
       return num * factorial(num-1);
   }


   public static int power1(int x, int y){
       if ( y==0 ) return 1;
       return x * power1(x, y-1);
   }

   public static int power2(int x, int y){
       if ( y==0 ) return 1;
       int xpnn2 = power2(x, y/2);
       int xn = xpnn2 * xpnn2;

       if ( y % 2 == 1 ) return xn * x;
       return xn;
   }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();

//        printDecreasing(5);
//        printIncreasing(5);

//        printDecreasingIncreasing(3);

//        System.out.println(factorial(5));

//        System.out.println(power1(2,5));
        System.out.println(power2(2,5));

//        printZigZag(3);


    }
}