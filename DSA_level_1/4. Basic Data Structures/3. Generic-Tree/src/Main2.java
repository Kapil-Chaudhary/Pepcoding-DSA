import java.util.ArrayList;
import java.util.Stack;

public class Main2 {

    private static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<Node>(); // children or leaf nodes
    }

    private static Node constructor(int[] arr){
        Node root = null;
        Stack<Node> stack = new Stack<Node>();
        for ( int i = 0; i < arr.length; i++ ){
            if ( stack.size()==-1 ) stack.pop();
            else{
                Node node = new Node();
                node.data = arr[i];

                if ( stack.size()>0 ){
                    stack.peek().children.add( node );
                }
                else if ( stack.size()==0 ) root = node;
                stack.push( node );
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,50,-1, 60,-1,-1,30, 70,-1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node root = constructor(arr);

    }
}

