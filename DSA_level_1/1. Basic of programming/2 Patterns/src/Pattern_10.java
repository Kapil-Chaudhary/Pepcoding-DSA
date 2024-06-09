import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int l_s = num/2;
        int m_s = 0;
        for ( int i=1; i<=num; i++ ){
            System.out.print("\t".repeat(l_s) + "*");
            if ( m_s>0 ) System.out.print("\t".repeat(m_s) + "*");
            System.out.println();

            if ( i<=num/2 ){
                l_s--;
                m_s+=2;
            }
            else {
                l_s++;
                m_s-=2;
            }
        }
    }
}

/*

Sample Output

		*
	*		*
*				*
	*		*
		*

 */