package task2;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = result;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            current.val = sum % 10;
            carry = sum / 10;

            if (l1 != null || l2 != null || carry != 0) {
                current.next = new ListNode();
                current = current.next;
            }
        }

        if (carry != 0) {
            current.val = carry;
        }

        return result;
    }
}
