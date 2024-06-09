import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        int[][] arr1 = new int[n1][n1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }
        //find element
        int ele = scn.nextInt();

        int i = 0;
        int j = arr1[0].length-1;
        while ( i<arr1.length && j>=0 ){
            if ( arr1[i][j]<ele ) i++;
            else if ( arr1[i][j]>ele ) j--;
            else {
                System.out.println("row : " + i + ", col : " + j);
                break;
            }
        }
        System.out.println("Invalid Input");
    }

}