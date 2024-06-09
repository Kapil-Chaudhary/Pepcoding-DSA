/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

Assumption - number represented by a2 is greater.



Input Format
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output Format
A number representing difference of two numbers (a2 - a1), represented by two arrays.


Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10
number reresented by a1 is smaller than number represented by a2


Sample Input
3
2
6
7
4
1
0


Sample Output
7
3
3


 */


import java.util.Arrays;
import java.util.Scanner;

public class Difference_Of_Two_Arrays  {

    public static void main(String  args[]){
        Scanner scan = new Scanner(System.in);

        //Array 1
        int num1 = scan.nextInt();
        int[] arr1 = new int[num1];
        for ( int i=0; i<num1; i++) arr1[i]= scan.nextInt();
//        System.out.println("Array 1 is : " + Arrays.toString(arr1));

        //Array 2
        int num2 = scan.nextInt();
        int[] arr2 = new int[num2];
        for ( int i=0; i<num2; i++) arr2[i]= scan.nextInt();
//        System.out.println("Array 2 is : " + Arrays.toString(arr2));



        if ( num1>num2 ) {
            int[] array = arr2;
            arr2 = arr1;
            arr1 = array;
        }


        int[] arr3 = new int[arr2.length];

        int index = 0;
        int mul = 1;
        int carry = 0;
        int i=0;
        while (i< arr3.length || carry<0 ){
            if ( index<arr1.length ){
                int val = arr2[arr2.length-1-i] - arr1[arr1.length-1-i] + carry;
                if ( val<0 ) {
                        val = val + 10;
                        carry = -1;
                }
                else if ( val==0 || val>0 ) carry=0;
//                System.out.println("val is : "+ val + "  , and carry is : "+ carry);
                arr3[arr3.length-1-i] = val;
                index++;
            }
            else  {
                int val = arr2[arr2.length- 1-i] + carry;
                if ( val<0 ) {
                    val = val + 10;
                    carry = -1;
                }
                else if ( val==0 || val>0 ) carry=0;
                arr3[arr3.length-1-i] = val;
                index++;
            }
//            else carry=0;

            i++;
        }
        System.out.println(Arrays.toString(arr3));

        int ind = 0;
        for ( int range=0; range<arr3.length; range++){
            if ( arr3[range]!=0 ) break;
            else ind++;
        }

        for ( int jj=ind; jj<arr3.length; jj++) System.out.println(arr3[jj]);
    }
}


