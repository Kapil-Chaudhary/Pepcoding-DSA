//import java.util.Scanner;
//public class Inverse_of_a_Number {
//    public static void main(String arch[]){
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//
//        //convert int to str -->> then find length  -->>  convert to int
//         int len_of_number = String.valueOf(num).length();
//        int[] arr = new int[len_of_number];
////        System.out.println(arr.length);
//
//        // System.out.println(arr[1]); //   --> 0
//        int i = 1;
//        while ( num!=0 ){
//            int value = num%10;
//            arr[value-1] = i;
////            System.out.println(arr[value-1]);
//            num = num/10;
//            i++;
//        }
//        for ( int j=0;j<arr.length; j++){
//            System.out.print(arr[arr.length-1-j]);
////            System.out.print(arr[arr.length-1-j]);
//        }
//
//
//    }
//}


import java.util.Scanner;
public class Inverse_of_a_Number {
    public static void main(String arch[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int inv = 0;
        int op = 1;
        while ( num!=0 ){
            int od = num%10;
            int id = op;
            int ip = od;

            // make changes to inv using ip and id
            inv = inv + id * (int)Math.pow(10, ip-1);

            num = num/10;
            op++;
        }
        System.out.println(inv);

    }
}