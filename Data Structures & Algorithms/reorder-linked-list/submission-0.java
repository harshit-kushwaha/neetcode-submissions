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
    public void reorderList(ListNode head) {
        // create a reversed list. - 1 iteration O(n) - till mid - 1


        ListNode head1 = head;
        ListNode head2 = head;

        // head1 to mid
        while (head2 != null && head2.next != null){
            head1 = head1.next;
            head2 = head2.next.next;
        }
        ListNode mid = head1;
        head1 = head1.next;

        mid.next = null;

        ListNode reversedList = null;
        while (head1 != null){
            ListNode temp = head1.next;
            head1.next = reversedList;
            reversedList = head1;
            head1 = temp;
        }

        ListNode head3 = head;
        while (reversedList != null){
            ListNode temp = head3.next;
            ListNode temp2 = reversedList.next;
            head3.next = reversedList;
            head3 = temp;
            reversedList.next = head3;
            reversedList = temp2;
        }
        
    }
}
