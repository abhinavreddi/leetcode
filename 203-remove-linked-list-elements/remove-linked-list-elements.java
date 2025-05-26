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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return null;
        ListNode temp = new ListNode(0);
        temp.next= head;

        ListNode temp1 = temp;
        while(temp1.next!=null){
            if(temp1.next.val == val){
                temp1.next = temp1.next.next;
            }else{
                temp1=temp1.next;
            }
        }
        return temp.next;
    }
}