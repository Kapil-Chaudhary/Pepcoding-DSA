import java.util.HashMap;
import java.util.Scanner;


public class Longest_Consecutive_Sequence_Of_Elements {

    private static void LongestConsecutiveSequenceOfElements(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Step 1
        for ( int i=0; i< arr.length; i++ ) map.put(arr[i], true);

        // step 2
        for ( int key : map.keySet() ){
            if ( map.containsKey(key-1)==true ) map.put(key, false);
        }

        System.out.println(map);
        //step 3

        int maxLength = -1;
        int maxElement = -1;
        for ( int key : map.keySet() ){
            if ( map.get(key)==true ){
                int mL = 1;
                int mE = key;
                while ( map.containsKey(mE+mL)==true ){
                    mL = mL + 1;
                }
                if ( mL>maxLength ){
                    maxElement = key;
                    maxLength = mL;
                }
            }
        }
//        System.out.println(maxElement + "\t" + maxLength);
        for ( int i=0; i<maxLength; i++) {
            System.out.println(maxElement);
            maxElement++;
        }


    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) arr[i] = scn.nextInt();

        LongestConsecutiveSequenceOfElements(arr);
    }
}
