import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main1 {

    //create node class
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    // construct a generic tree
    public static Node construct(int[] arr){
        Node root = null;
        Stack<Node> st = new Stack<>();
        for ( int i=0; i< arr.length; i++ ){
            if ( arr[i]==-1 ){
                st.pop();
            }
            else {
                Node t = new Node();
                t.data = arr[i];

                if ( st.size()>0 ){
                    st.peek().children.add(t);
                }
                else if ( st.size()==0 ){
                    root = t;
                }
                st.push(t);
            }
        }
        return root;
    }

    // display a genric tree ---
    public static void display(Node node){
        String str = node.data + " --> ";
        for ( Node child : node.children ){
            str += child.data + ", ";
        }
        System.out.println(str + ".");

        for ( Node child : node.children ){
            display(child);
        }
    }


    //size of a gentric tree -- that's means total nodes
    public static int size(Node root){
        int s = 0;
        for ( Node child : root.children ){
            int c_size = size(child);
            s = s + c_size;
        }
        s = s + 1;
        return s;
    }


    //hight of a genric tree
    public static int hight(Node root){
        int h = -1;
        for ( Node child : root.children ){
            int ch = hight(child);
            h = Math.max(ch, h);
        }
        h += 1;
        return h;
    }


    // max element of a tree --
    public static int max(Node node){
        int max = Integer.MIN_VALUE;
        for ( Node child : node.children ){
            int cm = max(child);
            max = Math.max( cm, max );
        }
        max = Math.max( max, node.data );
        return max;
    }

    // transverse of a tree
    public static void traversal(Node node){
//        int data = node.data;
        System.out.println("Node pre : "+node.data);
        for ( Node child : node.children ){
            System.out.println("Edge pre : "+ node.data + "--" + child.data);
            traversal(child);
            System.out.println("Edge post : "+ node.data + "--" + child.data);
        }
        System.out.println("Node post : "+node.data);
    }


    // Level Order Traversal --->>> 1
    public static void Levelorder_Linewise(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);


        while ( q.size()>0 ){
            node = q.remove();
//            why ??  Node n = q.remove();
            System.out.print(node.data + " ");

            for ( Node child : node.children){
                q.add(child);
            }
        }
        System.out.println(".");
    }

    // Level Order Traversal ---->>> 2
    public static void Levelorder(Node node){

        Queue<Node> q1 = new ArrayDeque<>();
        Queue<Node> q2 = new ArrayDeque<>();

        q1.add(node);

        while ( q1.size()>0 ){
            node = q1.remove();
            System.out.print(node.data + " ");
            for ( Node child : node.children ){
                q2.add(child);
            }
//            System.out.println("q1 is empty : " + q1.size() + " \t "+ "q2 is empty : " + q2.size());

            if ( q1.size()==0 ){
                while ( q2.size()>0 ){
                    q1.add(q2.remove());
                }
                q2.clear();
                System.out.println();
            }
//            System.out.println("q1 is empty : " + q1.size() + " \t "+ "q2 is empty : " + q2.size());
        }
    }

    // Level Order Linewise - Zig Zag
    public static void LevelOrderLinewise_Zig_Zag(Node node){

        int move = 0;
        ArrayList<Node> ar = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        ar.add(node);

        while ( ar.size()>0 ){
            if ( move%2==0 ) {
//                System.out.print("array list at even index : " );
//                for ( int j=0; j<ar.size(); j++){
//                    System.out.print(ar.get(j).data + " ");
//                }
//                System.out.println();
                for ( int i=0; i<ar.size(); i++ ){
                    node = ar.get(i);
                    System.out.print(node.data + " ");
                    for ( Node child : node.children ){
                        q.add(child);
                    }
                }
                ar.clear();
                while ( q.size()>0 ){
                    ar.add(q.remove());
                }
            }
            else {
//                System.out.print("array list at odd index : " );
//                for ( int j=0; j<ar.size(); j++){
//                    System.out.print(ar.get(j).data + " ");
//                }
//                System.out.println();
                for ( int i=0; i<ar.size(); i++ ){
                    node = ar.get(i);
                    System.out.print(ar.get(ar.size()-1-i).data + " ");
                    for ( Node child : node.children ){
                        q.add(child);
                    }
                }
                ar.clear();
                while ( q.size()>0 ){
                    ar.add(q.remove());
                }
            }
            System.out.println();
            move++;
        }
    }
    // Level Order Linewise - Zig Zag  // method 2
    public static void LevelOrderLinewise_Zig_Zag1(Node node){
        int level = 0;
        Stack<Node> ms = new Stack<>();
        Stack<Node> cs = new Stack<>();
        ms.add(node);

        while ( ms.size()>0 ){
            if ( level%2==0 ){
                node = ms.pop();
                System.out.print(node.data + " ");
                for ( Node child: node.children ){
                    cs.push(child);
                }
            }
            else {
                node = ms.pop();
                System.out.print(node.data + " ");
                for ( int i=node.children.size()-1; i>=0; i--){
                    Node child  = node.children.get(i);
                    cs.push(child);
                }
            }

            if ( ms.size()==0 ){
                ms = cs;
                cs = new Stack<>();
                level++;
                System.out.println();
            }
        }
    }

    // mirror of a tree
    public static void mirror(Node node){
        for ( Node child : node.children ){
            mirror(child);
        }

        for( int i=0; i<node.children.size()/2; i++ ){
            Node first = node.children.get(i);
            Node last = node.children.get(node.children.size()-1-i);

            node.children.set(i,last);
            node.children.set(node.children.size()-1-i, first);
        }
    }

    // removeing leaves from tree --> method 1
    public static void removeLeaves(Node node) {

        for ( int i=node.children.size()-1; i>=0; i--){
            if ( node.children.get(i).children.size()>0 ){
                removeLeaves(node.children.get(i));
            }
            else {
                node.children.remove(i);
            }
        }
    }

    //// removeing leaves from tree --> method 2
    public static void removeLeaves_2(Node node){
        for ( int i=node.children.size()-1; i>=0; i-- ){
            if ( node.children.get(i).children.size()==0 ){
                node.children.remove(i);
            }
        }
        for ( Node child : node.children ){
            removeLeaves_2(child);
        }
    }

    // linearize a node  --->> method 1
    public static void linearize(Node node){
        for ( Node child : node.children){
            linearize(child);
        }

        for ( int i=node.children.size()-1; i>=1; i--){
            Node lc = node.children.remove(i);
            Node sl = node.children.get(i-1);

            Node slt = getTail(sl);
            slt.children.add(lc);
        }
    }

    // get tail
    public static Node getTail(Node node){
        while ( node.children.size()==1 ){
            node = node.children.get(0);
        }
        return node;
    }

    // linearize a node  --->> method 2
    public static void linearize_2(Node node){

    }

    // Find In Generic Tree ---> method 1
    public static boolean find(Node node, int data) {
        // write your code here
        for ( Node child : node.children ){
            boolean b = find(child, data);
            if ( b==true ) return true;
        }
        if ( node.data==data ) return true;
        else return false;
    }

    // Find In Generic Tree  ----->  method 2
    public static boolean find_2(Node node, int data) {
        if ( node.data==data ) return true;
        for ( Node child : node.children ){
            boolean cb = find_2(child, data);
            if ( cb==true ) return true;
        }
        return false;
    }


    // Node To Root Path In Generic Tree   ---> method 1
    public static ArrayList<Integer> nodeToRootPath(Node node, int data, ArrayList<Integer> ar){
//        ArrayList<Integer> ar = new ArrayList<>();
        for ( Node child : node.children ){
            ArrayList<Integer> cr = nodeToRootPath(child, data, ar);
            if ( cr.contains(data)==true ){
                ar.add(node.data);
//                System.out.println(ar);
                return ar;
            }
        }
        if ( node.data==data ) {
            ar.add(node.data);
//            System.out.println(ar);
            return ar;
        }
        else {
            return ar;
        }
    }

    // Node To Root Path In Generic Tree   ---> method 2
    public static ArrayList<Integer> nodeToRootPath_2(Node node, int data){

        if ( node.data == data ){
            ArrayList<Integer> ar = new ArrayList<>();
            ar.add(node.data);
            return ar;
        }
        // write your code here
        for ( Node child : node.children ){
            ArrayList<Integer> cr = nodeToRootPath_2(child, data);
            if ( cr.size()>0 ){
                cr.add(node.data);
                return cr;
            }
        }
        return new ArrayList<>();

    }

    // Lowest Common Ancestor (generic Tree)
    public static int lca(Node node, int d1, int d2) {
        // write your code here
        int ans = -1;
        ArrayList<Integer> ar1 = nodeToRootPath_2(node, d1);
        ArrayList<Integer> ar2 = nodeToRootPath_2(node, d2);

//        System.out.println(ar1 + "\t" + ar2);
        int i = 0;
        while ( i<ar1.size()-1 ){
            if ( ar1.get(ar1.size()-1-i)==ar2.get(ar2.size()-1-i) ) {
                ans = ar1.get(ar1.size()-1-i);
//                System.out.println(ans);
            }
            else break;
            i++;
        }
        return ans;
    }

    //// Distance Between Two Nodes In A Generic Tree
    public static int distanceBetweenNodes(Node node, int d1, int d2){
        int ans = 0;
        ArrayList<Integer> ar1 = nodeToRootPath_2(node, d1);
        ArrayList<Integer> ar2 = nodeToRootPath_2(node, d2);

        int i=0;
        while ( i<ar1.size()-1 ){
            if ( ar1.get(ar1.size()-1-i)==ar2.get(ar2.size()-1-i) ) {
                ans++;
//                System.out.println(ans);
            }
            else break;
            i++;
        }
        ans = ar1.size()-ans + ar2.size()-ans;
        return ans;
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
//        display(root);

//        int sz = size(root);
//        System.out.println(sz);

//        int hight = hight(root);
//        System.out.println("Height of a Genric Tree is : " + hight);
//
//        int max_ele_of_a_tree = max(root);
//        System.out.println("Maximum element of a tree is : "+ max_ele_of_a_tree);

//        traversal(root);

//        Levelorder_Linewise(root);
//        Levelorder(root);
//        LevelOrderLinewise_Zig_Zag1(root);

//        mirror(root);
//        display(root);

//        removeLeaves(root);
//        display(root);

//        linearize(root);
//        display(root);

//        int data = Integer.parseInt(br.readLine());
//        System.out.println(find(root, data));
//        System.out.println(find_2(root,data));
//        display(root);


        // method 1
        // Node To Root Path In Generic Tree   ---> method 1
//        int data = Integer.parseInt(br.readLine());
//        ArrayList<Integer> ar1 = new ArrayList<>();
//        ArrayList<Integer> ar = nodeToRootPath(root, data, ar1);
//        System.out.println(ar1);

        // method 2
        // Node To Root Path In Generic Tree
//        int data = Integer.parseInt(br.readLine());
//        ArrayList<Integer> path = nodeToRootPath_2(root, data);
//        System.out.println(path);


//        //// Lowest Common Ancestor (generic Tree)
//        int d1 = Integer.parseInt(br.readLine());
//        int d2 = Integer.parseInt(br.readLine());
//        int lca = lca(root, d1, d2);
//        System.out.println(lca);
        // display(root);


//        int d1 = Integer.parseInt(br.readLine());
//        int d2 = Integer.parseInt(br.readLine());
//        int dist = distanceBetweenNodes(root, d1, d2);
//        System.out.println(dist);
        // display(root);
    }
}
