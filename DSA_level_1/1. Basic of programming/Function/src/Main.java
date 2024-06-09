import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

    public static void binarySearch(int[] arr, int ele){

        int left = 0;
        int right = arr.length-1;

        int lastIndex = -1;
        while ( left<=right ) {
            int mid = (left + right) / 2;
            if ( arr[mid]==ele ){
                lastIndex = mid;
                left = mid + 1;
            }
            else if (arr[mid] > ele) right = mid - 1;
            else if (arr[mid] < ele) left = mid + 1;
        }

        left = 0;
        right = arr.length-1;

        int firstIndex = -1;
        while ( left<=right ) {
            int mid = (left + right) / 2;
            if ( arr[mid]==ele ){
                firstIndex = mid;
                right = mid - 1;
            }
            else if (arr[mid] > ele) right = mid - 1;
            else if (arr[mid] < ele) left = mid + 1;
        }

        System.out.println("firstIndex : " + firstIndex + "\n" + "lastIndex : " + lastIndex);
    }



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = Integer.parseInt(br.readLine());


        int[] arr = {10, 20, 20, 20, 50, 60, 70, 70, 90, 100};
        int ele = 70;
        binarySearch(arr, ele);

//        int n = Integer.parseInt(br.readLine());
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = Integer.parseInt(br.readLine());
//        }
//        int element = Integer.parseInt(br.readLine());
//
//        binarySearch(a, element);



    }

}