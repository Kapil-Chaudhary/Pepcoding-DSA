
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;

public class Notes {

    public static void stringBuilder(String A) {
        StringBuilder sb  =  new StringBuilder(A);
//        System.out.print(sb.indexOf("a"));
//        sb.length();
//        sb.deleteCharAt(1);
//        sb.indexOf("k");
//        sb.append("pp");
//        sb.charAt(2);
//        sb.toString();
//        sb.reverse();
//        sb.insert("kk", 1);

    }


    public static void hashSet() {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,4,3,4));

        HashSet<Integer> set = new HashSet<>(list);

        // check ele is there in set or not
        set.contains(1);

        // delete all the ele in set
        set.clear();

        // check is set emplty or not
        set.isEmpty();

        // to check the soze of a set
        set.size();

        // add element in set
        set.add(2);

        // remove obj from set
        set.remove(1);

        // create duplicate set
        set.clone();

        // add list into set
        System.out.println(set.addAll(Arrays.asList(11,22,33))); // return boolean
        System.out.println("set : " + set);

        //
        System.out.print("set : " + set.toString());



    }


    public static void hashMap(){
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(1,1,2,3,3));
        System.out.println("list : " + lst) ;


        HashSet<Integer> hs = new HashSet<>(lst);
        System.out.println("hashSet : " + hs);


        HashMap<Integer, Integer> hmap = new HashMap<>();
        for ( int ele : lst ){
            if ( hmap.containsKey(ele)==false ) hmap.put(ele, 1);
            else hmap.put(ele, hmap.get(ele)+1);
        }
        System.out.println("hmap : " + hmap);


        // to get keySet()
        System.out.println("keySet : " + hmap.keySet());

        // to get values
        System.out.println("value : " + hmap.values());

        for ( int key : hmap.keySet() ){
            if ( hmap.get(key).intValue()==1 ) System.out.print(key);
        }


        System.out.println("_----------------------------------------");

        // to get keySet()
        System.out.println("keySet : " + hmap.keySet());

        // to get values
        System.out.println("value : " + hmap.values());

        // to get size
        System.out.println("size : " + hmap.size());

        // to check is empty
        System.out.println("isEmplty : " + hmap.isEmpty());

        // return true if key is present
        System.out.println("1 is present or not : " + hmap.containsKey(1));

        // return value of its its ( key : 1 )
        System.out.println("value of 1 : " + hmap.get(1));

        // add value to the key
//        hmap.put(key, hmap.get(key)+1);

    }


    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
//        int row = scan.nextInt();

    }
}