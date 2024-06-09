import java.util.Arrays;
import java.util.Scanner;

public class Find_Element_In_An_Array  {

    public static void main(String  args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for ( int i=0; i<num; i++) arr[i]= scan.nextInt();
        System.out.println(Arrays.toString(arr));

        int num2 = scan.nextInt();
        int index = -1;

        for ( int i=0; i<arr.length; i++){
            if ( arr[i]==num2 ) index=i;
        }
        System.out.println(index);
    }
}