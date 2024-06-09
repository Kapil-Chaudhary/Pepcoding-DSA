import java.util.*;

class Solution {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> num1 = Arrays.asList(Arrays.stream(nums1) // IntStream
                .boxed()                // Stream<Integer>
                .toArray(Integer[]::new));

        List<Integer> num2 = Arrays.asList(Arrays.stream(nums2) // IntStream
                .boxed()                // Stream<Integer>
                .toArray(Integer[]::new));



        List<Integer> one = new ArrayList<>();
        for ( int i=0; i<num1.size(); i++ ) if ( !num2.contains(num1.get(i)) && !one.contains(num1.get(i)) ) one.add(num1.get(i));

        List<Integer> two = new ArrayList<>();
        for ( int i=0; i<num2.size(); i++ ) if ( !num1.contains(num2.get(i)) && !two.contains(num2.get(i)) ) two.add(num2.get(i));

        return List.of(one, two);
    }


    public static void main(String[] args){

        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};

//        List<List<Integer>> ans = findDifference(nums1, nums2);
//        System.out.println(ans);

        Set<List<Integer>> set = new HashSet<>();


    }
}