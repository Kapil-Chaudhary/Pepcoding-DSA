import java.util.HashMap;
import java.util.Scanner;

public class Pairs_With_Equal_Sum {
    public static boolean solution(int[] arr) {
        // write your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int i=0; i< arr.length; i++){
            for ( int j=i+1; j< arr.length; j++){
                int sum = arr[i]+arr[j];
                if ( map.containsKey(sum) ) return true;
                else map.put(sum, sum);
            }
        }

        return false;
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

