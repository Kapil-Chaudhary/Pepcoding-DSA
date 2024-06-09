import java.util.*;

public class Any_Base_Subtraction{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();  // 8
        int n1 = scn.nextInt(); // 777
        int n2 = scn.nextInt(); // 1

//        if ( n1<n2 ){
//            int val = n1;
//            n1 = n2;
//            n2 = val;
//        }
        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2){

        int value = 0;
        int carry = 0;
        int mul = 1;
        while ( n2>0  ){
            int end_n1 = n1%10;
            int end_n2 = n2%10;
//            System.out.println("end_n1 is : " + end_n1 + "  , end_n2 is : "+  end_n2);

            n1 = n1/10;
            n2 = n2/10;

            if ( (end_n2+carry) > end_n1 ) {
                end_n2 = end_n2 + carry;
                carry=0;
            }

            else if ( end_n2+carry<end_n1 || carry<0 ){
                    end_n2 = end_n2 + carry + b;
                    carry = -1;
                }


            int sub_last_value = end_n2 - end_n1;
//            System.out.println(sub_last_value);

            value = value +  (sub_last_value % b)*mul;
            mul = mul*10;


        }
        return value;
    }
}