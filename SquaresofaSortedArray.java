//977
//Easy


//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.


//Example 1:

//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]

// my own solution using java:

// just square and sort and return

class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
