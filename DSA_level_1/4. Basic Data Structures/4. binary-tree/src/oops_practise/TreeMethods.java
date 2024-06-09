package oops_practise;

public class TreeMethods {

    // calculate number of nodes
    public static int size(Node node){
        if ( node==null ) return 0;

        int ls = size(node.left);
        int rs = size(node.right);
        return (ls + rs + 1);
    }

    public static int sum(Node node){
        if ( node==null ) return 0;
        int ls = sum(node.left);
        int rs = sum(node.right);
        int totalSum = ls + rs + node.data;
        return totalSum;
    }

    public static int max(Node node){
        if ( node==null ) return Integer.MIN_VALUE;
        int lmax = max(node.left);
        int rmax = max(node.right);

        int max = Math.max(node.data, Math.max(lmax, rmax));
        return max;
    }


    public static int height(Node node){
        return 0;
    }


}
