/*

You will be given a string str that only contains lowercase or uppercase alphabets.You have to reverse the string .For eg a string "abcde" must be reversed into "edcba".

Input Format
A string

Output Format
A string


Constraints
1<=length of string<=1000

Sample Input
akshat

Sample Output
tahska


 */


import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_A_Linkedlist {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverse(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        while ( head!=null){
            al.add(0, head.val);
            head = head.next;
        }
        System.out.println(al);

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        int i=0;
        while ( i<al.size() ) {
            prev.next = new ListNode(al.get(i++));
            prev = prev.next;
        }
        return dummy.next;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

//        reverse(dummy.next);
        ListNode head = reverse(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}