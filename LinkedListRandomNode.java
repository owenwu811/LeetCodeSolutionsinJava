//382
//Medium

//Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

//Implement the Solution class:

//Solution(ListNode head) Initializes the object with the head of the singly-linked list head.
//int getRandom() Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be chosen.

// my own solution using java:

// just use Random() class


import java.util.RandomAccess;/**
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
    ArrayList<Integer> ar = new ArrayList<>();
    public Solution(ListNode head) {
        int cnt = 0;
        while (head != null) {
            ar.add(head.val);
            head = head.next;
            
            cnt++;
        }
        
    }
    
    public int getRandom() {
        Random rand = new Random();
        int res = ar.get(rand.nextInt(ar.size()));
        return res;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
