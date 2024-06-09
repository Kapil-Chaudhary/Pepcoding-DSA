import java.util.HashMap;
import java.util.Scanner;

public class Count_Of_All_Subarrays_With_Zero_Sum {
    public static int solution(int[] arr) {
        // write your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int sum = 0;
        int largestSum = 0;
        for ( int i=0; i<arr.length; i++){
            sum += arr[i];

            if ( map.containsKey(sum) ) {
                int pre_idx_value = map.get(sum);
                map.put( sum, pre_idx_value+1 );
                largestSum += pre_idx_value;
            }
            else {
                map.put( sum, 1 );
            }
        }

        return largestSum;
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
