//2799
//Medium

//You are given an array nums consisting of positive integers.

//We call a subarray of an array complete if the following condition is satisfied:

//The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array.
//Return the number of complete subarrays.

//A subarray is a contiguous non-empty part of an array.

// my own solution using java:

// brute force use set and check every subarray

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> tot = new HashSet<>();
        int ans = 0;
        for (int n: nums) {
            tot.add(n);
        }
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> hs = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                hs.add(nums[j]);
                if (hs.size() == tot.size()) {
                    ans++;
                }

            }
        }
        return ans;
    }
}
