//167
//Medium

//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

//Return the indices of the two numbers index1 and index2, each incremented by one, as an integer array [index1, index2] of length 2.

//The tests are generated such that there is exactly one solution. You may not use the same element twice.

//Your solution must use only constant extra space.

 

//Example 1:

//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]

// my own solution using java:

// sort and use two pointers:

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int l = 0;
        int r = numbers.length - 1;
        while (l <= r) {
            int tot = numbers[l] + numbers[r];
            if (tot == target) {
                int[] ans = {l + 1, r + 1};
                return ans;
            }
            else if (tot > target) {
                r -= 1;
            }
            else {
                l += 1;
            }
        }
        int[] ans = {-1, -1};
        return ans;

    }
}
