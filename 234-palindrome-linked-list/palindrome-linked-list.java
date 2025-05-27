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

    public ListNode reverse(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode front;

        while(curr!=null){
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr=front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null)return true;
        ListNode fast= head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newNode = reverse(slow.next);
        ListNode first = head;
        ListNode second = newNode;

        while(second!=null){
            if(first.val!=second.val){
                reverse(newNode);
                return false;
            }
            first=first.next;
            second = second.next;
        }
        reverse(newNode);
        return true;
    }
}