import java.util.Arrays;

public class Practise {

    public static int myAtoi(String s) {
        String[] ss = s.strip().split("");
        System.out.println(Arrays.toString(ss));

        String ans = "";
        String sign = "";
        for ( int i=0; i<ss.length; i++ ){
            if ( ans.length()==0  && ( ss[i].equals("+") || ss[i].equals("-")) ) {
                sign+=ss[i];
//                System.out.println(sign);
            }
            else if ( ans.isEmpty() && !Character.isDigit(ss[i].charAt(0))  ) return 0;
            else if ( Character.isDigit(ss[i].charAt(0)) ) ans+= ss[i];
            else  break;
        }
        System.out.println(ans + "  " + sign);
        if ( sign.length()>1 ) return 0;
        if ( sign.contains("-")) ans = "-" + ans;
         double d  = Double.parseDouble(ans);
        return (int) d;
    }

    public static void main(String[] args) {
//        String s = "-91283472332";
//        String s = "-3.14159";
//        String s = "  -+1.2   ";
        String s = "   -42";
//        System.out.println(s.strip());
//        System.out.println(Arrays.toString(s.strip().split("")));

        System.out.println(myAtoi(s));
    }
}