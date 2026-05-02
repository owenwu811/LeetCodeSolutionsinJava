//41
//Hard

//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.


//Example 1:

//Input: nums = [1,2,0]
//Output: 3
//Explanation: The numbers in the range [1,2] are all in the array.

// my own solution using java:

// just keep updating start with the next number you don't know for sure dosen't exist yet for each number you see in nums

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int start = 1;
        for (int n: nums) {
            if (n == start) {
                start = n + 1;
            }
        }
        return start;
    }
}
