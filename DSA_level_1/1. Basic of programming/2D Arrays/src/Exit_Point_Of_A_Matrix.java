/*

1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.


Input Format
-------------------
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements


Output Format
------------------------
row
col (of the point of exit)


Constraints
1 <= n <= 10^2
1 <= m <= 10^2
e1, e2, .. n * m elements belongs to the set (0, 1)


Sample Input
---------------------
4
4
0
0
1
0
1
0
0
0
0
0
0
0
1
0
1
0


Sample Output
------------------------
1
3

 */



import java.util.Scanner;

public class  Exit_Point_Of_A_Matrix{

    public static void display(int[][] arr){
        for ( int i=0; i<arr.length; i++) {
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
        for ( int i=0; i<arr.length; i++) {
            for ( int j=0; j<arr[0].length; j++){
                arr[i][j] = scan.nextInt();
            }
        }
//         display(arr);

        int direction = 0;
        int row = 0;
        int col = 0;
        int i = 0;
        int j = 0;
        while( (row>=0 && row<arr.length) &&  (col>=0 && col<arr[0].length) ){
            int val = arr[row][col];
            direction = direction + val;
//            System.out.println("Direction : " + direction);
            i = row;
            j = col;
            //  east
            if ( direction%4==0 ){
//                 System.out.println(row + " "+ col);
                col = col + 1;
            }

            // south
            else if ( direction%4==1){
//                 System.out.println(row + " "+ col);
                row = row+1;
            }

            // west
            else if ( direction%4==2){
//                 System.out.println(row + " "+ col);
                col = col-1;
            }

            //north
            else if ( direction%4==3){
//                 System.out.println(row + " "+ col);
                row = row-1;

            }
        }
        System.out.println(i + "\n" + j);
//        System.out.println(row + "\n" + col);
    }
}
