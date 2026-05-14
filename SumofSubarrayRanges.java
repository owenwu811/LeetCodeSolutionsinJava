//2104
//Medium

//You are given an integer array nums. The range of a subarray of nums is the difference between the largest and smallest element in the subarray.

//Return the sum of all subarray ranges of nums.

//A subarray is a contiguous non-empty sequence of elements within an array.


//Example 1:

//Input: nums = [1,2,3]
//Output: 4

// my own solution using java:

// use TreeSet:

class Solution {
    public long subArrayRanges(int[] nums) {
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            TreeSet<Long> ts = new TreeSet<>();
            for (int j = i; j < nums.length; j++) {
                ts.add(Long.valueOf(nums[j]));
                ans += (ts.getLast() - ts.getFirst());

            }
        }
        return ans;
    }
}
