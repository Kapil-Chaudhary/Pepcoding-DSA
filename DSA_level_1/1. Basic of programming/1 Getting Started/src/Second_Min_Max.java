import java.util.Arrays;
import java.util.Scanner;

public class Second_Min_Max{

    public static int Second_Max(int[] arr){
        int largest_num = Integer.MIN_VALUE;
        int second_num = Integer.MIN_VALUE;

        for ( int i=0; i< arr.length; i++){
            if ( arr[i]>largest_num){
                second_num = largest_num;
                largest_num = arr[i];
            }
            else if ( arr[i]<largest_num && arr[i]>second_num ) second_num=arr[i];
        }
        return second_num;
    }

    public static int second_Min(int[] arr) {
        int largest_Min = Integer.MAX_VALUE;
        int second_Min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest_Min) {
                second_Min = largest_Min;
                largest_Min = arr[i];
            } else if (arr[i] > largest_Min && arr[i] < second_Min) second_Min = arr[i];
        }
        return second_Min;
    }


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for ( int i=0; i<num; i++) arr[i] = scan.nextInt();
        System.out.println("Integer Array: " + Arrays.toString(arr));

        int value1 = Second_Max(arr);
        int value2 = second_Min(arr);
        System.out.println(value1 + " " + value2);
    }
}
