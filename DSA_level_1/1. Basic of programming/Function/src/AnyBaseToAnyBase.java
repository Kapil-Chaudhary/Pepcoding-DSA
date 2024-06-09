import java.util.*;

public class AnyBaseToAnyBase{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();

//        System.out.print(getValueConversion(n, sourceBase, destBase));
        int anyToDec = anybaseToDecimal(n, sourceBase);
        int decToAny = decimalToAnybase(anyToDec, destBase);
        System.out.print(decToAny);
    }

    public static int anybaseToDecimal(int n, int sourceBase){
        int ans = 0;
        int mul = 1;

        while ( n!=0 ){
            int rem = n%10;
            n = n/10;

            ans = ans + rem*mul;
            mul = mul*sourceBase;
        }
        return ans;
    }

    public static int decimalToAnybase(int n, int deseBase){
        int ans = 0;
        int mul = 1;

        while ( n!=0 ){
            int rem = n%deseBase;
            n = n/deseBase;

            ans = ans + rem*mul;
            mul = mul*10;
        }
        return ans;
    }
}
