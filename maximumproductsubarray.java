
//152
//medium

//Given an integer array nums, find a subarray that has the largest product, and return the product.

//The test cases are generated so that the answer will fit in a 32-bit integer.

 

//Example 1:

//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.

// my own solution using java:

class Solution {
    public int maxProduct(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = Math.min(res, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int cur = 1;
            for (int j = i; j < nums.length; j++) {
                cur *= nums[j];
                res = Math.max(res, cur);
            }
        }



        return res;
    }
}
