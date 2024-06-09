import java.util.Stack;

public class Iterative_Pre_Post_In {

    // --->   Create Node class
    public static class Node{
        int data;
        Main.Node left;
        Main.Node right;

        Node(int data, Main.Node left, Main.Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    // pair class
    public static class Pair{
        Main.Node node;
        int state;

        Pair(Main.Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    // --->  Create constructor
    public static Main.Node construct(Integer[] arr){
        Main.Node root = new Main.Node(arr[0], null, null);

        Stack<Main.Pair> st = new Stack<>();
        Main.Pair root_pair = new Main.Pair(root, 1);
        st.add(root_pair);

        int idx = 1;
        while( st.size()>0 ){
            Main.Pair top = st.peek();

            if ( top.state==1 ){
                Integer data = arr[idx++];
                top.state++;

                if ( data!=null ) {
                    Main.Node left_node = new Main.Node(data, null, null);
                    top.node.left = left_node;

                    Main.Pair left_pair = new Main.Pair(left_node, 1);
                    st.push(left_pair);

                }
            }
            else if ( top.state==2 ){
                Integer data = arr[idx++];
                top.state++;

                if ( data!=null ){
                    Main.Node right_node = new Main.Node(data, null, null);
                    top.node.right = right_node;

                    Main.Pair right_pair = new Main.Pair(right_node, 1);
                    st.push(right_pair);
                }
            }
            else{
                st.remove(top);
//                st.pop();
            }
        }
        return root;
    }

    // --> display
    public static void display(Main.Node node){
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
    public static void Iterative_Pre_Post_In( Main.Node node ){
        Stack<Main.Pair> st = new Stack<>();
        Main.Pair p = new Main.Pair(node, 1);
        st.push(p);

        String Pre = "";
        String In = "";
        String Post = "";

        while ( st.size()>0 ){
            Main.Pair top = st.peek();

            if ( top.state==1 ){ // pre, state++, left
                Pre += top.node.data + " ";
                top.state++;
                if ( top.node.left!=null ){
                    Main.Pair new_pair = new Main.Pair(top.node.left, 1);
                    st.push(new_pair);
                }
            }
            else if ( top.state==2 ){
                In += top.node.data + " ";
                top.state++;
                if ( top.node.right!=null ){
                    Main.Pair new_pair = new Main.Pair(top.node.right, 1);
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

    public static void main(String[]args) {
        Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        Main.Node root = construct(arr);
//        display(root);
        Iterative_Pre_Post_In(root);

    }
}

