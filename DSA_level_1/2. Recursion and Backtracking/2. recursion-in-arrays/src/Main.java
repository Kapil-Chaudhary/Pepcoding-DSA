import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static int[] allIndices(int[] arr, int x, int idx, int count) {

        if ( arr.length==idx ) {
            int[] base = new int[count];
            return base;
        }
        else if( arr[idx]==x ) {
            count++;
        }

        System.out.println("idx : " + idx);
        int[] ans = allIndices(arr, x, idx+1, count);
        if ( arr[idx]==x ){
            System.out.println("find -   At idx : " + idx);
            ans[count-1] = idx;
            System.out.println(Arrays.toString(ans));
            return ans;
        }
        else {
            System.out.println("pos of idx : " + idx);
            return ans;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        System.out.println(Arrays.toString(iarr));

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }
}