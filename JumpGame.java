//55
//Medium

//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

//Return true if you can reach the last index, or false otherwise.
 

//Example 1:

//Input: nums = [2,3,1,1,4]
//Output: true

// correct java solution (could not solve - review later):

class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) { return false;}
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
