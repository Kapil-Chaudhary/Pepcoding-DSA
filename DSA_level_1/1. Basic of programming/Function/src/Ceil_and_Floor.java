/*

In a country of novice government, the economic system is changed where only coins are used that too of various denominations. Whenever a foreigner visits this country, they visit a money exchanger to get the currency of the same country. As the foreigner is unaware of the denomination of the country, the money exchange prefers to tell them the denomination which is the nearest maximum and nearest minimum to the denomination mentioned by the foreigner. In case they get the correct guess of the denomination, they are told the same denomination. The denominations are always quoted in ascending order.

Example 1: In a country, 8 given denominations are as follows
[5, 10, 15, 22, 33, 40, 42, 55]

The foreigner asks for denomination 25.
The money exchange tells them that denominations of 33 and 22 are available.

Example 2:
In a country, 5 given denominations are as follows
[7, 14, 18, 25, 30]

The foreigner asks for the denomination of 18.

The money exchange tells them a denomination of 18 is available.

You are required to print the values told by the money exchange to the foreigner.

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of the array a.
3. You are given another number d.
4. You are required to find the ceil and floor of d in array a.




Input Format
------------------
A number n
n1
n2
.. n number of elements
A number d



Output Format
-----------------------
A number representing ceil
A number representing floor


Constraints
------------------
1 <= n <= 1000
-10^9 <= n1, n2, .. n elements <= 10^9
-10^9 <= d <= 10^9


Sample Input
-----------------
10
1
5
10
15
22
33
40
42
55
66
34


Sample Output
-------------------
40
33



 */



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ceil_and_Floor {

    public static void ceilAndFloor(int[] a, int element){

        int ceil = -1;
        int floor = -1;

        int left = 0;
        int right = a.length - 1;
        while (left <= right) {

            int mid = (left + right) / 2;

            if ((a[mid] < element && a[mid + 1] > element) || (a[mid] > element && a[mid - 1] < element)) {
                if (a[mid] < element && a[mid + 1] > element) {
//                    System.out.println( "floor : " + a[mid] + "\t  ceil : " + a[mid + 1] );
                    ceil = a[mid + 1];
                    floor = a[mid];
                    break;
                } else if (a[mid] > element && a[mid - 1] < element) {
//                    System.out.println("floor : " + a[mid-1] + "\t  ceil : " + a[mid] );
                    ceil = a[mid];
                    floor = a[mid - 1];
                    break;
                }
            } else if (a[mid] > element) {
                right = mid - 1;
            } else if (a[mid] < element) {
                left = mid + 1;
            } else if (a[mid] == element) {
//                System.out.println("floor : " + element + "\t  ceil : " + element );
                ceil = element;
                floor = element;
                break;
            }
        }

        System.out.println(ceil + "\n" + floor);
    }


    public static void main(String[] args) throws Exception {

//        int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        int element = 34;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[Integer.parseInt(br.readLine())];
        for ( int i=0; i< arr.length; i++ ) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int element = Integer.parseInt(br.readLine());

        ceilAndFloor(arr, element);


    }
}