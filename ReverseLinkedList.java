
//206
//Easy

//Given the head of a singly linked list, reverse the list, and return the reversed list.

// my own solution using java:

// grab all the values of the linked list into an arraylist, reverse the array list, and turn it back into a linked list and return the head of the new linked list

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
        ArrayList<Integer> vals = new ArrayList<>();
        while (head != null) {
            vals.add(head.val);
            head = head.next;
        }
        Collections.reverse(vals);
        System.out.println(vals);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (Integer val: vals) {
            cur.next = new ListNode(val);
            cur = cur.next;

        }

        return dummy.next;
        
    }
}
