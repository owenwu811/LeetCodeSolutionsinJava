//234
//Easy

//Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

// my own solution using java:

// just reverse it and compare

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
    public boolean isPalindrome(ListNode head) {
        LinkedList<Integer> ll = new LinkedList<>();
        while (head != null) {
            ll.add(head.val);
            head = head.next;

        }
        LinkedList<Integer> reversed = new LinkedList<>(ll);
        Collections.reverse(ll);
        System.out.println(reversed);
        return reversed.equals(ll);
        
        
        
    }
}
