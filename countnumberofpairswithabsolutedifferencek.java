
//2006
//easy

//Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

//The value of |x| is defined as:

//x if x >= 0.
//-x if x < 0.
 

//Example 1:

//Input: nums = [1,2,2,1], k = 1
//Output: 4
//Explanation: The pairs with an absolute difference of 1 are:
//- [1,2,2,1]
//- [1,2,2,1]
//- [1,2,2,1]
//- [1,2,2,1]

// my own solution using java:

class Solution {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    ans++;
                }
            }
            }
        }
        return ans;
    }
}
