import java.util.Scanner;

public class Middle_Of_A_Linked_List {
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

    /*
        public boolean isPalindromeHelper(ListNode right){
        if ( right==null ) return true;
        boolean rres = isPalindromeHelper(right.next);
        if ( rres==false ) return false;
        else if ( right.val != left.val ) return false;
        else{
            left = left.next;
            return true;
        }
    }


    static ListNode left;
    public boolean isPalindrome(ListNode head) {
        left = head;
        return isPalindromeHelper(head);
    }
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = midNode(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
