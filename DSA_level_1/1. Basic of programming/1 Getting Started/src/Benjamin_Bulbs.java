import java.util.Scanner;

public class Benjamin_Bulbs {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for ( int i=1; i*i<num; i++){
            System.out.println(i * i);
        }
    }
}
