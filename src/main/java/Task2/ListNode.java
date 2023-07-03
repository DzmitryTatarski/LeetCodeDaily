package Task2;

public class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public int getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }
}
