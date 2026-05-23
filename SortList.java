
//148
//Medium

//Given the head of a linked list, return the list after sorting it in ascending order.

// my own solution using java:

// turn the linked list into an array, sort it, and back into linked list

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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> ar = new ArrayList<>();
        while (head != null) {
            ar.add(head.val);
            head = head.next;
        }
        Collections.sort(ar);
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        for (int i = 0; i < ar.size(); i++) {
            dummy.next = new ListNode(ar.get(i));
            dummy = dummy.next;

        }
        return res.next;
        
    }
}
