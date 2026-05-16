//164
//Medium

//Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.

//You must write an algorithm that runs in linear time and uses linear extra space.

 

//Example 1:

//Input: nums = [3,6,9,1]
//Output: 3

// my own solution using java:

// just do what the question asks:

class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int ans = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            ans = Math.max(ans, nums[i] - nums[i - 1]);
        }
        if (ans == Integer.MIN_VALUE) {
            return 0;
        }
        return ans;
        
    }
}
