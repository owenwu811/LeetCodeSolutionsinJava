
//19
//Medium

//Given the head of a linked list, remove the nth node from the end of the list and return its head.

// my own solution using java:

//just turn it into an arraylist, and get the difference of total size and n to find the element you need to delete, delete it, and conver tback into linked list

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> ar = new ArrayList<>();
        while (head != null) {
            ar.add(head.val);
            head = head.next;
        }
        int diff = ar.size() - n;
        ar.remove(diff);
        ListNode res = new ListNode();
        ListNode dummy = res;
        for (Integer num: ar) {
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }
        return res.next;

        
    }
}
