import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Primes {

    public static int checkPrime(int num){
        int value = 0;
        for( int div=2; div*div<=num; div++){
            if ( num%div==0 ) {
                value++;
                break;
            }
        }
        return value;
    }

    public static void solution(ArrayList<Integer> al){
        for ( int i=0; i<al.size(); i++){
            int check_prime = checkPrime(al.get(i));
            if ( check_prime==0 ) {
                al.remove(i);
                i--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            al.add(scn.nextInt());
        }
        solution(al);
//        System.out.println(al.size());
        System.out.println(al);
    }

}
/*

[760,
74, 310, 440, 512, 207, 638, 466, 644, 735, 724, 640, 136, 916, 706, 329, 187, 310, 194, 652, 830, 796, 544, 453,
112, 632, 15, 414, 572, 831, 253, 33, 6, 678, 183, 482, 717, 539, 649, 591, 133, 81, 913, 600, 248, 579, 60, 812, 644,
242, 856, 657, 830, 51, 96, 950, 960, 779, 338, 393, 658, 8, 576, 535, 720, 262, 357, 801, 777, 588, 934, 910, 508,
158, 989, 973, 366, 760, 993, 128, 581, 393, 770, 718, 801, 180, 530, 145, 855, 611, 94, 222, 826, 77, 136, 987, 896,
412, 336, 808, 406, 436, 835, 612, 763, 938, 766, 474, 612, 6, 198, 473, 85, 33, 74, 88, 833, 33, 35, 806, 315, 436,
704, 429, 614, 214, 452, 352, 336, 750, 906, 378, 192, 94, 910, 966, 629, 693, 966, 34, 847, 279, 622, 376, 813,
411, 496, 946, 399, 553, 532, 895, 550, 723, 616, 729, 147, 231, 627, 745, 436, 726, 120, 828,
918]

*/