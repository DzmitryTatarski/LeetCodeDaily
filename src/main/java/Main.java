import task1x.task19.Solution;
import task1x.task19.ListNode;

// the class to check results
public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        int n = 1;

        Solution solution = new Solution();
        ListNode newHead = solution.removeNthFromEnd(head, n);

        // Вывод нового списка
        ListNode current = newHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

    }


}
