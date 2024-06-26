import java.util.*;

public class Decimal_To_Any_Base{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        // write code here
        int pow = 0;
        int ans = 0;

        while ( n!=0 ){
            int rem = n%b;
            ans += rem*Math.pow(10, pow++);
            n = n/b;
        }
        return ans;
    }
}