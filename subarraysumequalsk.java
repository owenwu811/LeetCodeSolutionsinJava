//560
//medium

//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

//A subarray is a contiguous non-empty sequence of elements within an array.

 

//Example 1:

//Input: nums = [1,1,1], k = 2
//Output: 2
//Example 2:

//Input: nums = [1,2,3], k = 3
//Output: 2


// my own solution using java: (surprised that this worked)

class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int now = 0;
            for (int j = i; j < nums.length; j++) {
                now += nums[j];
                if (now == k) {
                    ans++;
                }
            }
        } 
        return ans;
    }
}
