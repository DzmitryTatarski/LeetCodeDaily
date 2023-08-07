package task1x.task19;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode one = dummy;
        ListNode two = dummy;
        for (int i = 0; i <= n; i++) {
            two = two.next;
        }

        while (two != null){
            one = one.next;
            two = two.next;
        }
        one.next = one.next.next;
        return head;
    }
}
