import java.util.*;

public class Any_Base_Multiplication{

    public static int productSingle(int b, int n1, int n2){
        int carry = 0;
        int ans = 0;
        int mul = 1;
        while ( n1!=0 || carry>0 ){
            int end_value = n1%10; // % 3*4 = 12/5 ---> carry  12%5--> rem
            n1 = n1/10;

            int rem = (end_value * n2) + carry;
            ans = ans + (rem%b)*mul;
            carry = rem/b;
            mul = mul*10;
        }
        return ans;
    }


    public static int getSum(int b, int n1, int n2){

        int value = 0;
        int carry = 0;
        int mul = 1;
        while ( n1>0 || n2>0 || carry>0 ){
            int end_n1 = n1%10;
            int end_n2 = n2%10;

            n1 = n1/10;
            n2 = n2/10;


            int end_value_add = end_n1 + end_n2 + carry;
            value = value +  (end_value_add % b)*mul;
            mul = mul*10;
            carry = end_value_add / b;


        }
//        if ( carry>0 ) {
//            int f = mul*carry + value;
//            return f;
//        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();  // 8
        int n1 = scn.nextInt(); // 777
        int n2 = scn.nextInt(); // 1


        int ans = 0;
        int carry = 0;
        int mul = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int res1 = productSingle(b, n1, d2);
            res1 = res1 * mul;
            ans = getSum(b, ans, res1);
            mul = mul * 10;
        }
        System.out.println(ans);
    }
}