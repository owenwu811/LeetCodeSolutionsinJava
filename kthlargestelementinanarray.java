//215
//medium

//Given an integer array nums and an integer k, return the kth largest element in the array.

//Note that it is the kth largest element in the sorted order, not the kth distinct element.

//Can you solve it without sorting?

 

//Example 1:

//Input: nums = [3,2,1,5,6,4], k = 2
//Output: 5


// my own solution using java:

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (i == nums.length - k) {
                return nums[i];
            }
        }
        return 0;
    }
}
