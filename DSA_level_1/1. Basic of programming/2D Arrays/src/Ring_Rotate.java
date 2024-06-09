/*

You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

shell-rotate

You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.


Input Format
--------------------
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements of array a
A number s
A number r


Output Format
----------------------
output is handled by display function



Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
0 < s <= min(n, m) / 2
-10^9 <= r <= 10^9


Sample Input
----------------------------
5
7
11
12
13
14
15
16
17
21
22
23
24
25
26
27
31
32
33
34
35
36
37
41
42
43
44
45
46
47
51
52
53
54
55
56
57
2
3

Sample Output
----------
11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57

 */



import java.util.Scanner;

public class Ring_Rotate {


    public static int[] fillOnedFromShell(int[][] arr, int s){

        int min_r = s - 1;
        int min_c = s - 1;
        int max_r = arr.length - s;
        int max_c = arr[0].length - s;

        int length = 2 * ( (max_r - min_r) + (max_c - min_c) );
        int[] oned = new int[length];

        int index = 0;

        // left wall
        for ( int row=min_r, col=min_c; ( row<=max_r); row++){
            oned[index] = arr[row][col];
            index++;
        }

        // bottom wall
        for ( int col=min_c+1, row=max_r; col<=max_c; col++ ){
            oned[index] = arr[row][col];
            index++;
        }

        // right wall
        for ( int row=max_r-1, col=max_c; row>=min_r; row-- ){
            oned[index] = arr[row][col];
            index++;
        }

        // top wall
        for ( int col=max_c-1, row=min_r; col>=min_c+1; col--){
            oned[index] = arr[row][col];
            index++;
        }

//        System.out.println(Arrays.toString(oned));

        return oned;
    }



    public static void reverse(int[] arr, int first, int last){
        while ( first<last ){
            int val = arr[first];
            arr[first] = arr[last];
            arr[last] = val;

            first++;
            last--;
        }
    }
    public static void rotate(int[] arr, int r){
        r = r % arr.length;
        if ( r<0 ){
            r = r + arr.length;
        }

        reverse(arr, 0, arr.length-1-r);
        reverse(arr, arr.length-1-r+1, arr.length-1);
        reverse(arr, 0, arr.length-1);

//        System.out.println(Arrays.toString(arr));

    }

    public static void fillShellFromOned(int[][] arr, int s, int[] oned ){


        int min_r = s - 1;
        int min_c = s - 1;
        int max_r = arr.length - s;
        int max_c = arr[0].length - s;

//        int length = 2 * ( (max_r - min_r) + (max_c - min_c) );
//        int[] oned = new int[length];

        int index = 0;

        // left wall
        for ( int row=min_r, col=min_c; ( row<=max_r); row++){
            arr[row][col] = oned[index];
            index++;
        }

        // bottom wall
        for ( int col=min_c+1, row=max_r; col<=max_c; col++ ){
            arr[row][col] = oned[index];
            index++;
        }

        // right wall
        for ( int row=max_r-1, col=max_c; row>=min_r; row-- ){
            arr[row][col] = oned[index];
            index++;
        }

        // top wall
        for ( int col=max_c-1, row=min_r; col>=min_c+1; col--){
            arr[row][col] = oned[index];
            index++;
        }
    }



    //  ------------->    rotateShall   <----------------
    public static void rotateShell(int[][] arr, int s, int r){

        int[] oned = fillOnedFromShell(arr, s);
        rotate(oned, r);
        fillShellFromOned(arr, s, oned);
    }


    //  ---------------->    display    <-------------------
    public static void display(int[][] arr) {
        for ( int i=0; i<arr.length; i++ ){
            for ( int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++ ){
            for(int j=0; j<m; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        int s = scan.nextInt();
        int r = scan.nextInt();

//        System.out.println("Main array is : ");
//        display(arr);
//        System.out.println();


        rotateShell(arr, s, r);
        display(arr);

    }

}
