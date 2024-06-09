import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class Main {

    // --->   Create Node class
    public static class Node{
        int data;
        Node left;
        Node right;

        Node( int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    // pair class
    public static class Pair{
        Node node;
        int state;

        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    // --->  Create constructor
    public static Node construct(Integer[] arr){
        Node root = new Node(arr[0], null, null);

        Stack<Pair> st = new Stack<>();
        Pair root_pair = new Pair(root, 1);
        st.add(root_pair);

        int idx = 1;
        while( st.size()>0 ){
            Pair top = st.peek();

            if ( top.state==1 ){
                Integer data = arr[idx++];
                top.state++;

                if ( data!=null ) {
                    Node left_node = new Node(data, null, null);
                    top.node.left = left_node;

                    Pair left_pair = new Pair(left_node, 1);
                    st.push(left_pair);

                }
            }
            else if ( top.state==2 ){
                Integer data = arr[idx++];
                top.state++;

                if ( data!=null ){
                    Node right_node = new Node(data, null, null);
                    top.node.right = right_node;

                    Pair right_pair = new Pair(right_node, 1);
                    st.push(right_pair);
                }
            }
            else{
//                st.remove(top);
                st.pop();
            }
        }
        return root;
    }

    // --> display
    public static void display(Node node){
        if ( node==null ) return;

        String str = "";
        str +=   node.left == null? "." : node.left.data + "" ;
        str += " <- " + node.data + " -> ";
        str += node.right == null? "." : node.right.data +"" ;
        System.out.println(str);

        display(node.left);
        display(node.right);
    }


    // Iterative Pre, Post and In-order traversal
    public static void Iterative_Pre_Post_In( Node node ){
        Stack<Pair> st = new Stack<>();
        Pair p = new Pair(node, 1);
        st.push(p);

        String Pre = "";
        String In = "";
        String Post = "";

        while ( st.size()>0 ){
            Pair top = st.peek();

            if ( top.state==1 ){ // pre, state++, left
                Pre += top.node.data + " ";
                top.state++;
                if ( top.node.left!=null ){
                    Pair new_pair = new Pair(top.node.left, 1);
                    st.push(new_pair);
                }
            }
            else if ( top.state==2 ){
                In += top.node.data + " ";
                top.state++;
                if ( top.node.right!=null ){
                    Pair new_pair = new Pair(top.node.right, 1);
                    st.push(new_pair);
                }
            }
            else {
                Post += top.node.data + " ";
                st.pop();
            }
        }
        System.out.println(Pre +"\n" + In + "\n" + Post);

    }

    public static void printKLevelsDown(Node node, int k){
        // write your code here
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while( q.size()>0 ){

            int size = q.size();
            for ( int i=0; i<size; i++ ){
                Node top = q.remove();
                if ( k==0 ){
                    System.out.println(top.data);
                }
                else{
                    if ( top.left!=null ) q.add(top.left);
                    if ( top.right!=null ) q.add(top.right);
                }
            }
            k--;
        }
    }

    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        int k = Integer.parseInt(br.readLine());

        Node root = construct(arr);
        printKLevelsDown(root, k);
    }

}