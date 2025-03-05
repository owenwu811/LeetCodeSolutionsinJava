
//2908
//easy

//You are given a 0-indexed array nums of integers.

//A triplet of indices (i, j, k) is a mountain if:

//i < j < k
//nums[i] < nums[j] and nums[k] < nums[j]
//Return the minimum possible sum of a mountain triplet of nums. If no such triplet exists, return -1.

// my own solution using java:

class Solution {
    public int minimumSum(int[] nums) {
        float res = Float.POSITIVE_INFINITY;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[k] < nums[j]) {
                    res = Math.min(res, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }
        if (res == Float.POSITIVE_INFINITY) {
            return -1;
        }
        return Math.round(res);
    }
}
