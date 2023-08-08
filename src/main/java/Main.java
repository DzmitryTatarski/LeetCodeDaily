import task2x.task21.Solution;
import task2x.task21.ListNode;

// the class to check results
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        solution.mergeTwoLists(list1, list2);

    }
}

