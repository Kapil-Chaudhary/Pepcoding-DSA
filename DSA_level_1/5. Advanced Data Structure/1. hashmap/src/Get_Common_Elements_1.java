import java.util.HashMap;
import java.util.Scanner;

public class Get_Common_Elements_1 {

    public static void commonElement(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> map1 = new HashMap<>();

        for ( int val : arr1 ) map1.put(val, map1.getOrDefault(val, 0) + 1);

        for ( int num : arr2 ){
            if ( map1.containsKey(num) ){
                System.out.println(num);
                map1.remove(num);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int[] arr1 = new int[num1];
        for ( int i=0; i<arr1.length; i++) arr1[i] = scn.nextInt();

        int num2 = scn.nextInt();
        int[] arr2 = new int[num2];
        for ( int i=0; i<arr2.length; i++) arr2[i] = scn.nextInt();

//        System.out.println();
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

        commonElement(arr1, arr2);
    }
}
