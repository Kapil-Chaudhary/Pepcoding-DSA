package oops_practise;

public class Main extends Construct_Tree{

    public static void main(String[] args) {
        Integer[] arr = { 50, 25,12, null, null, 37,null,null, 75, 62, null, null, 87, null, null, null, null};

        Node root = construct(arr);
        display(root);


        int totalNode = size(root);
        System.out.println("total node : " + totalNode);


    }
}
