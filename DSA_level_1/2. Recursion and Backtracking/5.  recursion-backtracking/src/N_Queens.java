/*

1. You are given a number n, the size of a chess board.
2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
Note - Queens kill at distance in all 8 directions
3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.


Input Format
A number n


Output Format
Safe configurations of queens as suggested in sample output

Constraints
1 <= n <= 10


Sample Input
4


Sample Output
0-1, 1-3, 2-0, 3-2, .
0-2, 1-0, 2-3, 3-1, .


 */




import java.util.Scanner;

public class N_Queens {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] chess = new int[n][n];

        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if ( row==chess.length ){
            System.out.println(qsf +".");
            return;
        }

        for ( int col=0; col<chess.length; col++ ){

            if ( isItaSafePlaceForTheQueen(chess, row, col)==true ) {
                chess[row][col] = 1;
                printNQueens( chess, qsf + row + "-" + col + ", " , row+1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isItaSafePlaceForTheQueen(int[][] chess, int row, int col){
        //vertical check
        for ( int i=row-1, j=col; i>=0; i--){
            if ( chess[i][j] == 1 ){
                return false;
            }
        }

        for ( int i=row-1, j=col-1; i>=0 && j>=0; i--, j-- ){
            if ( chess[i][j] == 1 ){
                return false;
            }
        }

        for ( int i=row-1, j=col+1; i>=0 && j<chess.length; i--, j++ ){
            if ( chess[i][j]==1 ){
                return false;
            }
        }

        return true;
    }
}
