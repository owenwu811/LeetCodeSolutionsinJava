//3712
//Easy

//You are given an integer array nums and an integer k.

//Return an integer denoting the sum of all elements in nums whose frequency is divisible by k, or 0 if there are no such elements.

//Note: An element is included in the sum exactly as many times as it appears in the array if its total frequency is divisible by k.

// my own solution using java:

// use hashmap

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int val = hm.get(nums[i]);
                hm.remove(nums[i]);
                hm.put(nums[i], val + 1);

            }
            else {
                hm.put(nums[i], 1);
            }
        }
        for (var i : hm.keySet()) {
            //System.out.println(i);
            //System.out.println(hm.get(i));
            if (hm.get(i) % k == 0) {
                System.out.println(i);
                ans += (i * hm.get(i));
            }

        }
        return ans;

    }
}
