import java.util.*;

public class Any_Base_Addition{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();  // 8
        int n1 = scn.nextInt(); // 777
        int n2 = scn.nextInt(); // 1


        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2){

        int value = 0;
        int carry = 0;
        int mul = 1;
        while ( n1>0 || n2>0 || carry>0  ){
            int end_n1 = n1%10;
            int end_n2 = n2%10;

            n1 = n1/10;
            n2 = n2/10;


            int end_value_add = end_n1 + end_n2 + carry;
            value = value +  (end_value_add % b)*mul;
            mul = mul*10;
            carry = end_value_add / b;


        }
        return value;
    }
}