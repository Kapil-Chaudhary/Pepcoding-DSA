import java.util.*;
import java.util.stream.*;

public class Solution {

    // 2
    public static int solve2(ArrayList<Integer> list) {
        int[] arr = {1,2,3,4,5};


// To boxed array
//        Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
//        Integer[] ever = IntStream.of( data ).boxed().toArray( Integer[]::new );

// To boxed list
        List<Integer> you  = Arrays.stream( arr ).boxed().collect( Collectors.toList() );
//        List<Integer> like = IntStream.of( data ).boxed().collect( Collectors.toList() );

        HashSet<Integer> set = new HashSet<>();
        return set.size();
    }


    // 1
    public static void solve11(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int key : A ){
            if ( map.containsKey(key)==false ) map.put(key, 1);
            else map.put(key, map.get(key) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for ( int key : B ){
            if ( map.containsKey(key)==true ) ans.add(map.get(key));
            else ans.add(0);
        }

        System.out.println("ans : " + ans);

    }

    public int[] solve111(int[] A, int[] B) {
        List<Integer> listA = Arrays.stream(A).boxed().collect( Collectors.toList());
        List<Integer> listB = Arrays.stream(B).boxed().collect( Collectors.toList());

        int[] arr = new int[listB.size()];
        int index = 0;
        for ( int ele : listB ){
            arr[index++] = Collections.frequency(listA, ele);
        }
        return arr;

    }


    // 2
    public static int population(HashMap<String, Integer> map, int K){

        int count = 0;
        for ( String key : map.keySet() ) if ( map.get(key)<K ) count++;
        return count;

    }

    public static int solve(int[] A, int B) {
        for ( int i=0; i<A.length; i++ ){
            for ( int j=(i+1); j<A.length; j++ ){
                if ( (A[i] + A[j]) == B ) {
                    System.out.println(A[i] + " " + A[j] );
                    return 1;
                }
            }
        }
        return 0;
    }



        public static void countSubString(String str, String ans, String maxStr, int len){

            if ( str.length()==0 ){
                String[] strParts = ans.split("");
                List<String> listParts = Arrays.asList(strParts);
                HashSet<String> hsetFromString = new HashSet<String>( listParts );
//                System.out.println(hsetFromString);

                if ( ans.length()==hsetFromString.size() && maxStr.length()<ans.length() ) {
                    //  && maxStr.length()<ans.length()
                    System.out.println("maxlen : " + maxStr.length());
                    System.out.println(ans);
                     maxStr = ans;
                     len = maxStr.length();
                    System.out.println("maxlen : " + maxStr.length());
                }
//                 System.out.println(ans);
                return;
            }

            char ch = str.charAt(0);
            String str1 = str.substring(1);

            countSubString(str1, ans + "", maxStr, len);
            countSubString(str1, ans + ch, maxStr, len);

        }

        public static int lengthOfLongestSubstring(String s) {
            int len = 0;
            countSubString(s, "",  "", len);
            return len;
        }



    public static void main(String[] args){

        // 2
//        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3, 4, 3, 6, 6));
//        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 3, 3, 9, 0, 1, 0));
//        System.out.print(solve(list2));


        // homework
        // 1
//        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 1, 1));
//        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2));
//        solve(list1,list2);

        // 2
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        map.put("India", 12);
//        map.put("Pakistan", 8);
//        map.put("China" , 9);
//
//        int k = 10;


        // return count
//        System.out.println(Collections.frequency(list, 1));


//        int[] arr = {2,3,1};
//        int[] arr = {2,2,1,4};
//        System.out.println(solve(arr, 3));


        String s = "bbbbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);

    }
}