//21
//Easy

//You are given the heads of two sorted linked lists list1 and list2.

//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

//Return the head of the merged linked list.

// my own solution using java:

// combine the values, sort them, and back into linked list

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        while (list1 != null) {
            one.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            two.add(list2.val);
            list2 = list2.next;
        }

        one.addAll(two);
        Collections.sort(one);
        ListNode res = new ListNode();
        ListNode dummy = res;
        for (Integer o: one) {
            dummy.next = new ListNode(o);
            dummy = dummy.next;
        }
        return res.next;

    }
}
