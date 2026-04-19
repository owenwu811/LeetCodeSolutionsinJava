//1
//Easy

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//You can return the answer in any order.



//Example 1:

//Input: nums = [2,7,11,15], target = 9

// my own solution using java:
// use a hashmap to store diff with the index

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hm.containsKey(diff)) {
                System.out.println(i);
                System.out.println(hm.get(diff));
                int[] res = {hm.get(diff), i};
                return res;
            }
            hm.put(nums[i], i);
        }
        int[] a = {};
        return a;
        
        
        

}}
