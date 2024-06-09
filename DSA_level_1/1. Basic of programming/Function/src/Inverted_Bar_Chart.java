/*


1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print an inverted bar chart representing value of arr a.


Input Format
-----------------
A number n
n1
n2
.. n number of elements


Output Format
-----------------------
An inverted bar chart of asteriks representing value of array a


Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 10


Sample Input
--------------------
5
3
1
0
7
5


Sample Output
---------------------------
*	*		*	*
*			*	*
*			*	*
			*	*
			*	*
			*
			*


 */

import java.util.Arrays;
import java.util.Scanner;

public class Inverted_Bar_Chart  {

    public static void main(String  args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for ( int i=0; i<num; i++) arr[i]= scan.nextInt();
        System.out.println(Arrays.toString(arr));

//        int max = Collections.max(Arrays.asList(arr));
        int max = 0;
        for ( int i=0; i<num; i++){
            if ( arr[i]>max ) max=arr[i];
        }
        System.out.println(max);


        for ( int i=0; i<max; i++){
            for ( int j=0; j<arr.length; j++){
                if ( arr[j] > i ) System.out.print("*\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}