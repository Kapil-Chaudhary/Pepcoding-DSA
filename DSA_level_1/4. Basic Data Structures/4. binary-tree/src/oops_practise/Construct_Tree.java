package oops_practise;

import java.util.Stack;

public class Construct_Tree extends TreeMethods {

//    Integer[] arr = { 50, 25,12, null, null, 37,null,null, 75, 62, null, null, 87, null, null, null, null};

    public static Node construct(Integer[] arr){
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
        return root;
    }


    // display method
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


}
