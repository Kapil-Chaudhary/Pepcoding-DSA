import java.io.*;
import java.util.*;

public class Main {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int[] ans = new int[a.length + b.length];

        int i=0;
        int j=0;
        int range = 0;
        while( range<ans.length ){
            if ( a[i]>=b[j] ){
                ans[range++] = b[j++];
            }else{
                ans[range++] = a[i++];
            }
        }


        while ( i<a.length ){
            ans[range++] = a[i++];
        }
        while ( j<b.length ){
            ans[range++] = b[j++];
        }

        return ans;
    }

    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for(int i = 0 ; i < m; i++){
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a,b);
        print(mergedArray);
    }

}