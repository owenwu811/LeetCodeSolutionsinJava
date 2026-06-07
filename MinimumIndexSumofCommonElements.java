//3682
//Medium

//You are given two integer arrays nums1 and nums2 of equal length n.

//We define a pair of indices (i, j) as a good pair if nums1[i] == nums2[j].

//Return the minimum index sum i + j among all possible good pairs. If no such pairs exist, return -1.


//Example 1:

//Input: nums1 = [3,2,1], nums2 = [1,3,1]

// my own solution using java:

// use two hashmaps, and look for common keys

class Solution {
    public int minimumSum(int[] nums1, int[] nums2) {
        HashMap<Integer, List<Integer>> one = new HashMap<>();
        HashMap<Integer, List<Integer>> two = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!one.containsKey(nums1[i])) 
            {
                one.put(nums1[i], new ArrayList<>());
            }
            one.get(nums1[i]).add(i);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (!two.containsKey(nums2[i])) {
                two.put(nums2[i], new ArrayList<>());
            }
            two.get(nums2[i]).add(i);
        }
        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Integer, List<Integer>> entry: one.entrySet()) {
            if (two.containsKey(entry.getKey())) {
                int cur = Collections.min(one.get(entry.getKey())) + Collections.min(two.get(entry.getKey()));
                ans = Math.min(ans, cur);

            }
        }
        if (ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}
