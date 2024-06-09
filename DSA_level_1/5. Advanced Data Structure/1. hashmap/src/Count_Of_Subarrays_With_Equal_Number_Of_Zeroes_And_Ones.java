import java.util.HashMap;
import java.util.Scanner;

public class Count_Of_Subarrays_With_Equal_Number_Of_Zeroes_And_Ones {
    public static int solution(int[] arr) {
        // write your code here
        for ( int i=0; i< arr.length; i++ ) {
            if ( arr[i]==0 ) arr[i]=-1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;

        int count = 0;
        for ( int i=0; i<arr.length; i++){
//            System.out.println(map);
            sum += arr[i];
            if ( map.containsKey(sum) ){
                int prev_idx_value = map.get(sum);
                map.put(sum, prev_idx_value+1 );
                count += prev_idx_value;
            }
            else {
                map.put(sum, 1);
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}

