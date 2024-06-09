import java.util.Scanner;

public class Highest_Frequency_Character {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int[] map = new int[256];
        for ( int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map[ch]++;
        }

        char maxc = str.charAt(0);
        int maxf = map[maxc];

        for (int i=1; i<map.length; i++) {
            int freq = map[i];
            if (freq > maxf) {
                maxf = freq;
                maxc = (char) i;
            }
        }
        System.out.println(maxc);
    }
}
