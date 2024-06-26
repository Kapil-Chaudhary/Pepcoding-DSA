import java.util.*;

public class Digit_Frequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int counter = 0;
        while (n != 0) {
            int end_value = n % 10;
            if (end_value == d) counter++;
            n = n / 10;
        }
        return counter;
    }
}