//3Sum
//15

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

//Notice that the solution set must not contain duplicate triplets.

 

//Example 1:

//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]

// my own solution using java:

// sort, and then do two pointers increasing and decreasing compared to 0

import java.util.Collections;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> myset = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int ts = nums[l] + nums[i] + nums[r];
                if (ts < 0) {
                    l++;
                }
                else if (ts > 0) {
                    r--;
                }
                else {
                    List<Integer> list = Arrays.asList(nums[i], nums[l], nums[r]);
                    if (!myset.contains(list)) {
                        ans.add(list);
                    }
                    myset.add(list);
                    l++;
                    r--;
                }
            }
        }
        return ans;
    }
}
