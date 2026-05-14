//239
//Hard

//You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

//Return the max sliding window.
 

//Example 1:

//Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
//Output: [3,3,5,5,6,7]
//Explanation: 
//Window position                Max
//---------------               -----
//[1  3  -1] -3  5  3  6  7       3
// 1 [3  -1  -3] 5  3  6  7       3
// 1  3 [-1  -3  5] 3  6  7       5
// 1  3  -1 [-3  5  3] 6  7       5
// 1  3  -1  -3 [5  3  6] 7       6
// 1  3  -1  -3  5 [3  6  7]      7

// my own solution using java:

//since java dosent have sortedlist, use treeset and hashmap to determine frequency and when to remove from treeset since treeset only has uniques

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            if (hm.containsKey(nums[i])) {
                int val = hm.get(nums[i]);
                hm.remove(nums[i]);
                hm.put(nums[i], val + 1);
                if (hm.get(nums[i]) <= 0) {
                    ts.remove(nums[i]);
                    hm.remove(nums[i]);
                }
            }
            else {
                ts.add(nums[i]);
                hm.put(nums[i], 1);
            }

        }
        int[] ans = new int[nums.length - k + 1];
        ans[0] = ts.getLast();
        System.out.println(ts);
        for (int i = 0; i < nums.length - k + 1; i++) {
            if (hm.containsKey(nums[i])) {
                int val = hm.get(nums[i]);
                hm.remove(nums[i]);
                hm.put(nums[i], val - 1);
                if (hm.get(nums[i]) <= 0) {
                    hm.remove(nums[i]);
                    ts.remove(nums[i]);
                }
            }
            if (i + k < nums.length) {
                if (hm.containsKey(nums[i + k])) {
                    int val = hm.get(nums[i + k]);
                    hm.remove(nums[i + k]);
                    hm.put(nums[i + k], val + 1);
                    ts.add(nums[i + k]);
                }
                else {
                    hm.put(nums[i + k], 1);
                    ts.add(nums[i + k]);
                }
           
                ans[i + 1] = ts.getLast();
            }
            
        }
        return ans;
    }
}
