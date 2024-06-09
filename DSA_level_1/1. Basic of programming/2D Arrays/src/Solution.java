import java.util.Arrays;

class practise{

    public static void display(int[] arr){
       System.out.println(Arrays.toString(arr));

    }

    public static int[] findDiagonalOrder(int[][] arr) {
        int[] ans = new int[arr.length* arr[0].length];
        int count = 2 * arr.length - 1;
        int temp = 0;

        int row = 0;
        int col = 0;

        int val = 1;

        for ( int i=0; i<count; i++ ){

            if ( i<= (count/2) ){
                while ( ( row>=0 && row<arr.length) && ( col>=0 &&  col<arr[0].length ) ){
                    System.out.println("row : "+ row + ", col : " + col);
                    ans[temp++] = arr[row++][col--];
                }
                col = i+1;
                row = 0;
            }
            else {
                col = arr[0].length-1;
                row = val;
                while ( ( row>=0 && row<arr.length) && ( col>=0 &&  col<arr[0].length ) ){
                    System.out.println("------------  row : "+ row + ", col : " + col);
                    ans[temp++] = arr[row++][col--];
                }
                col = arr[0].length;
                val++;
                System.out.println("----------++++++  row : "+ row + ", col : " + col);
                display(ans);
            }

        }

        return ans;
    }


    public static void main(String[] args){

//        Scanner scan = new Scanner(System.in);
//        int row = scan.nextInt();
//        int col = scan.nextInt();
//
//        int[][] arr = new int[row][col];
//        for ( int i=0; i<arr.length; i++ ) for ( int j=0; j<arr[0].length; j++ ) arr[i][j] = scan.nextInt();
//
//
//        // print array
//        for ( int i=0; i< arr.length; i++ ) System.out.println(Arrays.toString(arr[i]));
//        System.out.println();


        int[][] arr =  {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] arr = {{1,2},{3,4}};

        for ( int i=0; i< arr.length; i++ ) System.out.println(Arrays.toString(arr[i]));
        System.out.println();

        int[] ans = findDiagonalOrder(arr);
        display(ans);
//            int[][] ans = generateMatrix(1);

    }
}