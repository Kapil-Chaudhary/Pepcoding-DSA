import java.util.*;

public class Any_Base_To_Decimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int ans = 0;
        int mul = 1;
        while ( n!=0 ){
            int val = n%10;
            ans = ans + val*mul;
            mul = mul*b;
            n = n/10;
        }
        return ans;
    }
}