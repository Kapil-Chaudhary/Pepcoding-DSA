// question
/*

1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a. The numbers can be 1 or 0 only.
4. You are standing in the top-left corner and have to reach the bottom-right corner.
Only four moves are allowed 't' (1-step up), 'l' (1-step left), 'd' (1-step down) 'r' (1-step right). You can only move to cells which have 0 value in them. You can't move out of the boundaries or in the cells which have value 1 in them (1 means obstacle)
5. Complete the body of floodfill function - without changing signature - to print all paths that can be used to move from top-left to bottom-right.

Note1 -> Please check the sample input and output for details
Note2 -> If all four moves are available make moves in the order 't', 'l', 'd' and 'r'


Input Format
--------------------
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements


Output Format
-----------------------
trrrdlt
tlldrt
.. and so on



Constraints
---------------------
1 <= n <= 10
1 <= m <= 10
e1, e2, .. n * m elements belongs to set (0, 1)




Sample Input
------------------
3 3
0 0 0
1 0 1
0 0 0


Sample Output
------------------
rddr


 */


import java.util.Scanner;
public class Flood_Fill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "" , visited);


    }

    // asf -> answer so far
    public static void floodfill(int[][] maze, int row, int col, String asf, boolean[][] visited) {

        if ( row<0 || col<0 || row==maze.length || col==maze[0].length ||
                maze[row][col]==1 || visited[row][col]==true ){
            return;
        }

        if ( row==maze.length-1 && col==maze[0].length-1 ){
            System.out.println(asf);
            return;
        }

        visited[row][col] = true;
        floodfill(maze,row-1, col,asf+"t", visited);
        floodfill(maze, row,col-1,asf+"l", visited);
        floodfill(maze,row+1, col,asf+"d", visited);
        floodfill(maze, row,col+1,asf+"r", visited);
        visited[row][col] = false;
    }
}

