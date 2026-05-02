//53
//Medium

//Given an integer array nums, find the subarray with the largest sum, and return its sum.


//Example 1:

//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.

// my own solution using java:

// use kadane's algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        int res = (int) Double.NEGATIVE_INFINITY;
        for (int n: nums) {
            res = Math.max(res, n);
        }
        int ss = 0;
        for (int n: nums) {
            if (ss < 0) {
                ss = 0;
            }
            ss += n;
            res = Math.max(res, ss);

        }
        return res;
    }
}
