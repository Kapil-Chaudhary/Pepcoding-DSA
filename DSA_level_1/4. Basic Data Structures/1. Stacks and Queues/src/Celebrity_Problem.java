/*

1. You are given a number n, representing the number of people in a party.
2. You are given n strings of n length containing 0's and 1's
3. If there is a '1' in ith row, jth spot, then person i knows about person j.
4. A celebrity is defined as somebody who knows no other person than himself but everybody else knows him.
5. If there is a celebrity print it's index otherwise print "none".

Note -> There can be only one celebrity. Think why?


Input Format
Input is managed for you


Output Format
Index of celebrity or none


Constraints
1 <= n <= 10^4
e1, e2, .. n * n elements belongs to the set (0, 1)

Sample Input
4
0000
1011
1101
1110

Sample Output
0


Constraints
1 <= n <= 10^4
e1, e2, .. n * n elements belongs to the set (0, 1)


Sample Input
4
0000
1011
1101
1110

Sample Output
0

 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Celebrity_Problem {

    public static void findCelebrity(int[][] arr) {
        Stack<Integer> stack = new Stack<>();
        for ( int i=0; i<arr.length; i++ ) stack.push(i);

        for ( int i=0; i< arr.length-1; i++ ) {
            int top = stack.pop();
            int bottom = stack.pop();
            if (arr[bottom][top] == 0) stack.push(bottom);
            else stack.push(top);
        }

        int partialCelebrety = stack.pop();
        for ( int i=0; i<arr.length; i++ ){
            if ( i==partialCelebrety ) ;
            else if ( arr[i][partialCelebrety]==0 || arr[partialCelebrety][i]==1 ){
                System.out.println("none");
                return;
            }
        }
        System.out.println(partialCelebrety);
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }
        findCelebrity(arr);
    }
}