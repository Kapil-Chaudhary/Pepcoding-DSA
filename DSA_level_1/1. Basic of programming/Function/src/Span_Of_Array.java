import java.util.Scanner;

public class Span_Of_Array {

    public static void main(String  args[]){
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();

            int[] arr = new int[num];
            for ( int i=0; i<num; i++) arr[i]= scan.nextInt();
//            System.out.println(Arrays.toString(arr));


            int smaller = arr[0];
            int largest = arr[0];

            for ( int i=1; i<arr.length; i++){
                if ( arr[i]>largest ) largest=arr[i];
                else if ( arr[i]<smaller ) smaller=arr[i];
            }
            System.out.println(largest - smaller);
    }
}
