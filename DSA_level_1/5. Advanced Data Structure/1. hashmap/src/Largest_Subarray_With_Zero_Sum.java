import java.util.HashMap;
import java.util.Scanner;

public class Largest_Subarray_With_Zero_Sum {
    public static int solution(int[] arr) {
        // write your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int sum = 0;
        int largestLength = 0;
        for ( int i=0; i<arr.length; i++){
//            System.out.println(map);
            sum += arr[i];

            if ( map.containsKey(sum) ) {
                int pre_idx = map.get(sum);
                if ( ( i-pre_idx ) > largestLength ) largestLength = i-pre_idx;
            }
            else {
                map.put( sum, i );
            }
        }

        return largestLength;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[scn.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }
}
