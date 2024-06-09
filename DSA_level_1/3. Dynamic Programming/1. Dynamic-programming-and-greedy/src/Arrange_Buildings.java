/*

        discription
---------------------------
1. You are given a number n, which represents the length of a road. The road has n plots on it's each side.
2. The road is to be so planned that there should not be consecutive buildings on either side of the road.
3. You are required to find and print the number of ways in which the buildings can be built on both side of roads.

Input Format
A number n

Output Format
A number representing the number of ways in which the buildings can be built on both side of roads.

Constraints
0 < n <= 45



---- input ----
6

--- output -----
441

 */



import java.util.Scanner;
public class Arrange_Buildings {

    public static long Arrange_Buildings_method1(int n){

        long oldBuilding = 1;
        long oldSpace = 1;

        for ( int i=2; i<=n; i++ ){
            long newBuilding = oldSpace;
            long newSpace = oldSpace + oldBuilding;

            oldBuilding = newBuilding;
            oldSpace = newSpace;
        }

        long total_ans_from_one_side = oldBuilding + oldSpace;
        long total_ans_from_both_side = total_ans_from_one_side * total_ans_from_one_side;
        return total_ans_from_both_side;

    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long ans = Arrange_Buildings_method1(n);
        System.out.println(ans);
    }
}
