package practise;

import java.util.Stack;

public class Main {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }


    public static class Pair{
        Node node;
        int state;

        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }


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

    public static void display(Node root) {
        if ( root==null ) return;

        String str = "";
        str += root.left==null ? "." : root.left.data + "";
        str += " <- " + root.data + " -> ";
        str += root.right==null ? "." : root.right.data + "";

        System.out.println(str);

        display(root.left);
        display(root.right);

    }





    public static void main(String[] args) {

//        Integer[] arr = { 50, 25,12, null, null, 37,30,null,null,null, 75, 62, null, 70, null, null, 87, null, null};
        Integer[] arr = { 50, 25,12, null, null, 37,null,null, 75, 62, null, null, 87, null, null, null, null};

        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while ( st.size()>0 ) {
            Pair top = st.peek();

            if ( top.state == 1 ) {
                idx++;
                if ( arr[idx]!=null ) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left , 1);
                    st.push(lp);
                }
                else {
                    top.node.left = null;
                }
                top.state++;
            }
            else if ( top.state == 2 ) {
                idx++;
                if ( arr[idx]!=null ) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right , 1);
                    st.push(rp);
                }
                else {
                    top.node.right = null;
                }
                top.state++;
            }
            else st.pop();
        }

        // 1. display
        display(root);

        // size of tree
//        int totalNodes = size(root);
//        System.out.println("size of tree : " + totalNodes);

        // sum of all nodes
//        int totalSum = sum(root);
//        System.out.println("totalSum : " + totalSum);


        // max of all nodes
//        int ans = max(root);
//        System.out.println("max of all nodes : " + ans);
    }
}
