import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {

    public static ArrayList<String> getStairPaths(int n) {

        if ( n<0 ) {
            ArrayList<String> b = new ArrayList<>();
            return b;
        }

        if ( n==0 ){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> step1 = getStairPaths(n-1);
        ArrayList<String> step2 = getStairPaths(n-2);


        ArrayList<String> res = new ArrayList<>();
        for ( String val : step1 ) res.add(1 + val);
        for ( String val : step2 ) res.add(2 + val);
        return res;

    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        List<String> ans = getStairPaths(num);
        System.out.println(ans);
    }

}