class Solution {

    public static int count = 0;

    public static void printEncoding(String str, String ans){

        if(str.length()==0 ) {
            System.out.println(ans);
            count++;
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        if ( ch=='0' ) return;
        else{
            int chv = ch - '0';
            char code = (char) ( 'a' + chv - 1 );
//            ans = ans + code;
//            System.out.println(ans);
            printEncoding(ros, ans +code );
        }

        if ( str.length()==1 ) return;
        else{
            String ch12 = str.substring(0,2);
            String ros12 = str.substring(2);

            int chi = Integer.parseInt(ch12);
            if ( chi>26 ) return;
            else{
                char code = (char) ( 'a' + chi - 1 );
                ans = ans + code;
                printEncoding(ros12, ans);
            }
        }
    }

    public static int numDecodings(String s) {

        printEncoding(s, "");
        int total = count;
        count = 0;
        return total;
    }

    public static void main(String[] args){
        int ans = numDecodings("123");
        System.out.println(ans);
    }
}