import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void solve() {

        /*

        [1,2,3,4,5]

        total number of element  = ( n-1 ) - i + 1
                                    5-1 -0 + 1 = 5


        [1, 2, 3, 4, 5]
        0      i     n
               -------
                 k


        total number of index 3 to n or length of k = ( n-1 ) -i + 1
                                  5-1 - 3 + 1 = 2

        k = ( n-1 ) -i + 1
        i = n - k;
        i = 5 - 2


         */

    }

    // question 1 -- find the max sum of subarray of length k;
    public static void solve1(int[] arr, int k){
        for ( int i=0; i<arr.length-k; i++ ){
            int count = 0;
            int j = i;
            int sum = 0;
            while (count<k){
                sum += arr[i];
                count++;
            }
        }
    }




    public static void main(String[] args ){
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2,1));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3));


//        int[] ar = {1,2,3};

//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3));
//        int ans = solve01(A, 5);
//        System.out.println(ans);

//        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(new Integer[10]));
//        System.out.println(ar);

//        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(new Integer[10]));
//        System.out.println(integerArrayList);

        // set first 10 elements with default value 0
//        ArrayList<Integer> arr = new ArrayList<Integer>(Collections.nCopies(10, 0));
//        System.out.println(arr);


        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        arr.add(new ArrayList<Integer>(Arrays.asList(1, 2)));
        arr.add(new ArrayList<Integer>(Arrays.asList(4, 5)));
//        arr.add(new ArrayList<Integer>(Arrays.asList(7, 8, 9)));



//        int[][] arr=  {
//                {1,2},
//                {3,4}
//        };



//        solve03(arr);
//        System.out.println(ans);




    }
}