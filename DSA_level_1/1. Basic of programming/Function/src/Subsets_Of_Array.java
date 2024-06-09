/*

1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to print all subsets of arr. Each subset should be
on separate line. For more clarity check out sample input and output.


    Input Format
------------------
A number n
n1
n2
.. n number of elements


    Output Format
-------------------
[Tab separated elements of subset]
..
All subsets



    Constraints
------------------
1 <= n <= 10
0 <= n1, n2, .. n elements <= 10^3


    Sample Input
--------------
3
10
20
30


    Sample Output
-------------------
-	-	-
-	-	30
-	20	-
-	20	30
10	-	-
10	-	30
10	20	-
10	20	30


 */





//import java.util.Scanner;
//
//public class Subsets_Of_Array {
//    public static void main(String[] args) throws Exception {
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//
//        int[] arr = new int[num];
//        for ( int i=0; i<arr.length; i++) arr[i] = scan.nextInt();
//
//
//        int limit = (int) Math.pow(2, arr.length);
//        for ( int i=0; i<limit; i++){
//            String str = "";
//            int temp = i;
//            for ( int j=arr.length -1; j>=0; j--){
//                int val = temp%2;
//                temp = temp/2;
//                if ( val==0 ) str = "_\t" + str;
////                else str = Integer.toString(arr[j]) + "\t" +  str;
//                else str = arr[j] + "\t" +  str;
//            }
//            System.out.println(str);
//        }
//    }
//}

import java.util.Scanner;

public class Subsets_Of_Array{

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for ( int i=0; i<num; i++) arr[i]=scan.nextInt();

        int range = (int) Math.pow(2, arr.length);


        for ( int i=0; i<range; i++){
            String str = "";
            int temp = i;
            for ( int j=0; j<arr.length; j++){
                int val = temp%2;
                temp = temp/2;

                if ( val==0 ) str = "_" + "\t" + str;
                else if ( val==1 ) str = arr[arr.length-1-j] + "\t" + str;
            }
            System.out.println(str);
        }
    }
}

/*

-	-	-
-	-	30
-	20	-
-	20	30
10	-	-
10	-	30
10	20	-
10	20	30


 */



