import java.util.Scanner;

public class Prime_Factorization {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for ( int div=2; div*div<=num; div++){
            while ( num%div==0 ){
                num = num/div;
                System.out.print(div+ " ");
            }
        }
        if( num!=0) System.out.println(num);
    }
}
