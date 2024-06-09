//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class Iterative_Preorder_And_Postorder_Of_Generic_Tree {
//    private static class Node {
//        int data;
//        ArrayList<Node> children = new ArrayList<>();
//    }
//
//    public static void display(Node node) {
//        String str = node.data + " -> ";
//        for (Node child : node.children) {
//            str += child.data + ", ";
//        }
//        str += ".";
//        System.out.println(str);
//
//        for (Node child : node.children) {
//            display(child);
//        }
//    }
//
//    public static Node construct(int[] arr) {
//        Node root = null;
//
//        Stack<Node> st = new Stack<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == -1) {
//                st.pop();
//            } else {
//                Node t = new Node();
//                t.data = arr[i];
//
//                if (st.size() > 0) {
//                    st.peek().children.add(t);
//                } else {
//                    root = t;
//                }
//
//                st.push(t);
//            }
//        }
//
//        return root;
//    }
//
//    static ArrayList<Integer> pre = new ArrayList<>();
//    static ArrayList<Integer> post = new ArrayList<>();
//
//    public static void IterativePreandPostOrder(Node node) {
//        // write your code here
//        // System.out.print(node.data + " ");
//        pre.add(node.data);
//        for ( Node child : node.children ){
//            IterativePreandPostOrder(child);
//        }
//        // System.out.print(node.data + " ");
//        post.add(node.data);
//    }
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        String[] values = br.readLine().split(" ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(values[i]);
//        }
//
//        Node root = construct(arr);
//        IterativePreandPostOrder(root);
//
////        System.out.println(pre);
//        for ( int i=0; i<pre.size(); i++ ){
//            System.out.print(pre.get(i) + " ");
//        }
//
//        System.out.println();
//
////        System.out.println(post);
//        for ( int i=0; i<post.size(); i++ ){
//            System.out.print(post.get(i) + " ");
//        }
//    }
//}


///// method 2
import java.io.*;
import java.util.*;

public class Iterative_Preorder_And_Postorder_Of_Generic_Tree{
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    static class Pair{
        Node node;
        int state;

        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    //  Iterative Preorder And Postorder Of Generic Tree
    public static void IterativePreandPostOrder(Node node) {
        Stack<Pair> st = new Stack<>();
        st.push( new Pair(node, -1) );

        String pre = "";
        String post = "";
        while ( st.size()>0 ){
            Pair top = st.peek();

            if ( top.state==-1 ){
                pre += top.node.data + " ";
                top.state++;
            }else if ( top.state==top.node.children.size()){
                post += top.node.data + " ";
                st.pop();
            }
            else{
                Pair cp = new Pair(top.node.children.get(top.state), -1);
                st.push(cp);

                top.state++;
            }
        }

        System.out.println(pre);
        System.out.println(post);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        IterativePreandPostOrder(root);
    }

}