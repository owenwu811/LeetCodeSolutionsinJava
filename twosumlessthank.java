
//1099
//easy

//Given an array nums of integers and integer k, return the maximum sum such that there exists i < j with nums[i] + nums[j] = sum and sum < k. If no i, j exist satisfying this equation, return -1.

 

//Example 1:

//Input: nums = [34,23,1,24,75,33,54,8], k = 60
//Output: 58
//Explanation: We can use 34 and 24 to sum 58 which is less than 60.
//Example 2:

//Input: nums = [10,20,30], k = 15
//Output: -1
//Explanation: In this case it is not possible to get a pair sum less that 15.



// my own solution using java:


class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] < k) {
                    if (nums[i] + nums[j] >= res) {
                        res = nums[i] + nums[j];
                    }

                }
            }
        }
        if (res == 0) {
            return -1;
        }
        return res;
    }
}
