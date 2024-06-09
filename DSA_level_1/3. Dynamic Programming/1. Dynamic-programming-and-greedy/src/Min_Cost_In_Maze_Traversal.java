import java.util.Scanner;

public class Min_Cost_In_Maze_Traversal {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];
        for ( int i=0; i<arr.length; i++ ){
            for ( int j=0; j<arr[0].length; j++ ){
                arr[i][j] = scan.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        for ( int i=dp.length-1; i>=0; i-- ){
            for ( int j=dp[0].length-1; j>=0; j-- ){

                if ( i==dp.length-1 && j==dp[0].length-1 ){
                    dp[i][j] = arr[i][j];
                }
                else if ( i==dp.length-1 ){
                    dp[i][j] = dp[i][j+1] + arr[i][j] ;
                }
                else if ( j==dp[0].length-1 ){
                    dp[i][j] = dp[i+1][j] + arr[i][j];
                }
                else{
                    int value = Math.min( dp[i+1][j], dp[i][j+1] );
                    dp[i][j] = value + arr[i][j] ;

                }
            }
        }

        System.out.println( dp[0][0]);
    }
}
