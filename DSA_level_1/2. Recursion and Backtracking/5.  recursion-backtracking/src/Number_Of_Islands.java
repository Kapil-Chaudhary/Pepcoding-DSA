import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Number_Of_Islands {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String parts = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }

        // write your code here
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        int count = 0;

        for ( int i=0; i< arr.length; i++){
            for ( int j=0; j< arr[i].length; j++ ){
                if ( arr[i][j]==0 && visited[i][j]==false ){
                    drawTreeForComponent(arr, i, j, visited);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void drawTreeForComponent(int[][] arr, int row, int col, boolean[][] visited ){

        if ( row<0 || col<0 || row>= arr.length || col>= arr[0].length || arr[row][col]==1 || visited[row][col]==true ){
            return;
        }

        visited[row][col] = true;
        drawTreeForComponent(arr, row-1, col, visited);
        drawTreeForComponent(arr, row, col+1, visited);
        drawTreeForComponent(arr, row, col-1, visited);
        drawTreeForComponent(arr, row+1, col, visited);



//        if ( arr[row-1][col]==0 ){
//            visited[row-1][col]=true;
//            drawTreeForComponent(arr, row-1, col, visited);
//        }
//        else if  ( arr[row][col-1]==0 ){
//            visited[row][col-1]=true;
//            drawTreeForComponent(arr, row, col-1, visited);
//        }
//        else if  ( arr[row+1][col]==0 ){
//            visited[row+1][col]=true;
//            drawTreeForComponent(arr, row+1, col, visited);
//        }
//        else if  ( arr[row][col-1]==0 ){
//            visited[row][col+1]=true;
//            drawTreeForComponent(arr, row, col+1, visited);
//        }
    }
}
