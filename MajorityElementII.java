//229
//Medium

//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.


//Example 1:

//Input: nums = [3,2,3]
//Output: [3]
//Example 2:

//Input: nums = [1]
//Output: [1]
//Example 3:

//Input: nums = [1,2]
//Output: [1,2]

// my own solution using java:

// just use a hashmap to tall up numbers and their frequencies

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        int size = nums.length / 3;
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
        for (int v: hm.keySet()) {
            int val = hm.get(v);
            if (val > size) {
                System.out.println(v);
                res.add(v);
            }
            
        }
        return res;
        
    }
}
