/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       ArrayList<Integer> ans = new ArrayList<>();
       ListNode curr=head;
       while(curr!=null){
        ans.add(curr.val);
        curr=curr.next;
       }
       curr=head;
       for(int i=ans.size()-1; i>=0; i--){
        curr.val=ans.get(i);
        curr=curr.next;
       }

       return head;
    }
}