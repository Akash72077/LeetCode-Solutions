class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) 
        
        return;
        
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
        
        Stack<ListNode> st = new Stack<>();
        while (slow != null) {
            st.push(slow);
            slow = slow.next;

        }
        
        ListNode dummy = new ListNode(0), curr = dummy;
        while (head != null || !st.isEmpty()) {
            if (head != null) {
                curr.next = head;
                head = head.next;
                curr = curr.next;
            }
            if (!st.isEmpty()) {
                curr.next = st.pop();
                curr = curr.next;
            }
        }
        
        curr.next = null;
    }
}