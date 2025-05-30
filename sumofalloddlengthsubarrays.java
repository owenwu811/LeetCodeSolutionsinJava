//1588
//easy

//Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

//A subarray is a contiguous subsequence of the array.

 

//Example 1:

//Input: arr = [1,4,2,5,3]
//Output: 58
//Explanation: The odd-length subarrays of arr and their sums are:
//[1] = 1
//[4] = 4
//[2] = 2
//[5] = 5
//[3] = 3
//[1,4,2] = 7
//[4,2,5] = 11
//[2,5,3] = 10
//[1,4,2,5,3] = 15
//If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

// my own solution using java:

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int cursum = 0;
            for (int j = i; j < arr.length; j++) {
                cursum += arr[j];
                if ((j - i + 1) % 2 != 0) {
                    ans += cursum;
                }
            }
        }
        return ans;
    }
}
