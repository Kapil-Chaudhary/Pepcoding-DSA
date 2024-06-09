import java.util.Scanner;

public class Palindrome_Linkedlist {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode midNode(ListNode head) {
        if ( head==null || head.next==null ) return head;

        ListNode slow = head;
        ListNode fast = head;
        while ( fast.next!=null && fast.next.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode reverse(ListNode head){
        if ( head==null || head.next==null ) return head;
        ListNode prev = null;
        ListNode curr = head;

        while ( curr!=null ){
            ListNode forword = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forword;
        }
        return prev;
    }

    public static boolean isPalindrome(ListNode head) {
        if ( head==null || head.next==null ) return true;
        ListNode midNode = midNode(head);

        ListNode midNext = midNode.next;
        midNode.next = null;
        ListNode head_of_second_list = reverse(midNext);

        while ( head!=null || head_of_second_list!=null ){
            if ( head.val!=head_of_second_list.val ) return false;
            head = head.next;
            head_of_second_list = head_of_second_list.next;
        }
        return true;
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

        System.out.println(isPalindrome(dummy.next));
    }
}
