import java.util.Scanner;

public class Input_Format {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();

        int[][] arr1 = new int[n1][m1];
        for ( int i=0; i<n1; i++){
            for ( int j=0; j<m1; j++){
                arr1[i][j] = scn.nextInt();
            }
        }
//        System.out.println(Arrays.toString(arr1));

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();

        int[][] arr2 = new int[n2][m2];
        for ( int i=0; i<n2; i++){
            for ( int j=0; j<m2; j++){
                arr2[i][j] = scn.nextInt();
            }
        }


        if ( m1 == n2 ){

            int[][] arr3 = new int[n1][m2];

            for( int i=0; i<arr3.length; i++){
                for ( int j=0; j<arr3[0].length; j++ ){
                    for ( int k=0; k<m1; k++){
                        arr3[i][j] +=  arr1[i][k]*arr2[k][j];
                    }
                }
            }
            for ( int row=0; row<arr3.length; row++ ){
                for ( int column=0; column<arr3[0].length; column++ ){
                    System.out.print(arr3[row][column] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
