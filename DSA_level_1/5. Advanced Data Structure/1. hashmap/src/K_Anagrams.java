import java.util.Scanner;

public class K_Anagrams {
    public static boolean areKAnagrams(String str1, String str2, int k) {
        // write your code here
        if ( str1.length()!=str2.length() ) return false;

        int[] freq = new int[26];
        for ( int i=0; i< str1.length(); i++){
            char ch = str1.charAt(i);
            freq[ch-'a']++;
        }

        for ( int i=0; i< str2.length(); i++){
            char ch = str1.charAt(i);
            if ( freq[ch-'a']>0 ) {
                freq[ch-'a']--;
            }
        }

        int diff = 0;
        for ( int i=0; i<26; i++){
            diff += freq[i];
        }
        if ( diff<=k ){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        int k = s.nextInt();
        System.out.println(areKAnagrams(str1, str2, k));

    }
}

