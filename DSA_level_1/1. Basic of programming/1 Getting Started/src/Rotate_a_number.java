import java.util.Scanner;

public class Rotate_a_number {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int k = scan.nextInt();


        // here we find length of number
        int temp = num;
        int nod=0;
        while ( temp>0 ){
            nod++;
            temp = temp/10;
        }

        // if number ( k )   is grater then number ( num )  example --> k=11 and num=5
        // so in this case we have to find remainder -->>    k%num
        k = k % nod;
        System.out.println("this is value of k is : " + k%nod); // it will give you -2 if no is -2    // why? bcos -2%5 is 3

        // if we have to perform negative rotation
        // then -->>
        if ( k<0 ){
            k = k + nod;
        }


        // here we find divisior and multiplier
        int div = 1;
        int mult = 1;
        for ( int i=0; i<nod; i++ ){
            if ( i<k ) div = div*10;
            else if ( i>=k ) mult = mult*10;
        }

        // here we find question and remainder
        int q = num / div;
        int r = num % div;

        // here we find answer and print it
        int rotated_ans = r * mult + q;
        System.out.println(rotated_ans);


    }
}
