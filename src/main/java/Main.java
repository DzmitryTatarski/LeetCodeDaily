import Task2.ListNode;
import Task2.Solution;

// the class to check results
public class Main {

    public static void main(String[] args) {
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(4, a);
        ListNode c = new ListNode(2, b);

        ListNode aa = new ListNode(0);
        ListNode bb = new ListNode(6, aa);
        ListNode cc = new ListNode(5, bb);

        Solution solution = new Solution();
        solution.addTwoNumbers(a, aa);
    }
}
