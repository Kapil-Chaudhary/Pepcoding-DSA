// bar chat

import java.util.Arrays;
import java.util.Scanner;

public class Bar_Chart {

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
                if ( max-arr[j] > i ) System.out.print("\t");
                else System.out.print("*\t");
            }
            System.out.println();
        }
    }
}