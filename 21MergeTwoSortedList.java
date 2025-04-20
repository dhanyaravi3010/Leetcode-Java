class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (a != null && b != null) {
            if (a.val < b.val) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }
        curr.next = (a != null) ? a : b;
        return dummy.next;
    }
}
