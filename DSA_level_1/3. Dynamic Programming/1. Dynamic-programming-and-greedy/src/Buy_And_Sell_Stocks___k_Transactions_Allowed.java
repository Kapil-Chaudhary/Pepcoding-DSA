import java.util.Scanner;

public class Buy_And_Sell_Stocks___k_Transactions_Allowed {





    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) arr[i] = scan.nextInt();
//        System.out.println(Arrays.toString(arr));

//        int[] rightToLeft = buy_And_Sell_Stocks_Two_Transaction_Allowed_RightToLeft(arr);
//        int[] leftToRight = buy_And_Sell_Stocks_Two_Transaction_Allowed_LeftToRight(arr);


//        System.out.println( Arrays.toString(leftToRight) );
//        System.out.println( Arrays.toString(rightToLeft));

//        int maxProfit = Integer.MIN_VALUE;
//        for ( int i=0; i<leftToRight.length; i++ ){

//            System.out.println( "left i : " + leftToRight[i]);
//            System.out.println( "right i : " + rightToLeft[i]);

//            int add = leftToRight[i] + rightToLeft[i];
//            if ( add>maxProfit ) maxProfit= add;
//        }
//        System.out.println(maxProfit);
//        System.out.println( Arrays.toString(rightToLeft) + "\n" + Arrays.toString(leftToRight));
//        System.out.println(rightToLeft + rightToLeft);
    }
}
